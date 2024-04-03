package baitap.bai8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai_8 {
    private List<Product> products = new ArrayList<>();
    private static final String FILE_PATH = "C:\\rikkei\\MD2\\session18-File\\product.bin";

    public void addProduct(Product product) {
        products.add(product);
        saveToFile();
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProduct(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error saving products: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading products: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        bai_8 manager = new bai_8();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Product Manager");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String productId = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter manufacturer: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter other details: ");
                    String otherDetails = scanner.nextLine();

                    Product product = new Product(productId, name, manufacturer, price, otherDetails);
                    manager.addProduct(product);
                    break;
                case 2:
                    manager.displayProducts();
                    break;
                case 3:
                    System.out.print("Enter product ID to search: ");
                    String searchId = scanner.nextLine();
                    manager.searchProduct(searchId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }
}
