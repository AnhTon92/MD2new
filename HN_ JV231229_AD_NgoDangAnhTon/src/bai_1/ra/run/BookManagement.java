package bai_1.ra.run;

import bai_1.ra.bussinessImp.Author;
import bai_1.ra.bussinessImp.Book;

import java.util.*;

public class BookManagement {
    private List<Author> authors = new ArrayList<>();
    private List<Book> books = new ArrayList<>();

    public BookManagement() {
        // Thêm một số tác giả mẫu
        authors.add(new Author(1, "Nguyen Nhat Anh", true, 1955));
        authors.add(new Author(2, "J.K. Rowling", false, 1965));
        authors.add(new Author(3, "Haruki Murakami", true, 1949));
        authors.add(new Author(4, "Anh Tôn", true, 1992));
        // Thêm một số sách mẫu
        books.add(new Book(1, "Mat Biec", "Mat Biec", 300, authors.get(0), 50000, 100, true));
        books.add(new Book(2, "Harry Potter", "Harry Potter and the Philosopher's Stone", 350, authors.get(1), 80000, 50, true));
        books.add(new Book(3, "Norwegian Wood", "Norwegian Wood", 400, authors.get(2), 60000, 150, true));
        books.add(new Book(4, "Món ngon Hà Nội", "Món ngon Hà Nội", 9000, authors.get(3), 900000, 150, true));
    }

    public static void main(String[] args) {
        BookManagement management = new BookManagement();
        management.runMenu();
    }

    private void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập số tác giả và nhập thông tin các tác giả");
            System.out.println("2. Nhập số sách và nhập thông tin các sách");
            System.out.println("3. Sắp xếp sách theo giá xuất sách tăng dần");
            System.out.println("4. Tìm kiếm sách theo tên tác giả sách");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn một chức năng: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inputAuthors();
                    break;
                case 2:
                    inputBooks();
                    break;
                case 3:
                    sortBooksByExportPrice();
                    break;
                case 4:
                    searchBooksByAuthorName();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    // phương thức tìm tên sách theo tên tác giả
    private void searchBooksByAuthorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tác giả sách cần tìm: ");
        String authorName = scanner.nextLine();
        for (Book book : books) {
            if (book.getAuthor().getAuthorName().equalsIgnoreCase(authorName)) {
                book.displayData();
            }
        }
    }
    // phương thức sắp xếp sách theo giá bán tăng dần

    private void sortBooksByExportPrice() {
        Collections.sort(books, Comparator.comparing(Book::getExportPrice));
        System.out.println("Sách đã được sắp xếp theo giá bán tăng dần");
        for (Book book : books) {
            book.displayData();
            System.out.println("-----------------------------------");
        }
    }

    // phương thức thêm sách
    private void inputBooks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách muốn thêm: ");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            Book book = new Book();
            book.inputData();
            books.add(book);
        }
    }

    // phương thức thêm tác giả
    private void inputAuthors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng tác giả muốn thêm: ");
        int numberOfAuthors = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfAuthors; i++) {
            Author author = new Author();
            author.inputData();
            authors.add(author);
        }
    }

}
