package baitap.bai9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {

    private List<Book> books;
    private static final String FILE_PATH = "C:\\rikkei\\MD2\\session18-File\\books.bin";

    public BookManager() {
        books = new ArrayList<>();
        loadBooks();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    public void updateBook(String title, String newAuthor, String newPublisher, double newPrice) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setAuthor(newAuthor);
                book.setPublisher(newPublisher);
                book.setPrice(newPrice);
                saveBooks();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void deleteBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
        saveBooks();
    }

    public void displayAllBooks() {
        books.forEach(System.out::println);
    }

    private void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            books = (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            books = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        String title, author, publisher;
        double price;
        int option;

        do {
            System.out.println("hồ");
            System.out.println("\nBook Manager");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    publisher = scanner.nextLine();
                    System.out.print("Enter price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    manager.addBook(new Book(title, author, publisher, price));
                    break;
                case 2:
                    System.out.print("Enter the title of the book to update: ");
                    title = scanner.nextLine();
                    System.out.print("Enter new author: ");
                    author = scanner.nextLine();
                    System.out.print("Enter new publisher: ");
                    publisher = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    manager.updateBook(title, author, publisher, price);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to delete: ");
                    title = scanner.nextLine();
                    manager.deleteBook(title);
                    break;
                case 4:
                    manager.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);

        scanner.close();
    }
}
