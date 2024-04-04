package bai_1.ra.bussinessImp;

import bai_1.ra.bussiness.IShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book implements IShop {
    // các thuộc tính
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private Author author;
    private float importPrice;
    private float exportPrice;
    private int quantity;
    private boolean bookStatus;
    private List<Author> authorsList = new ArrayList<>();

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author,
                float importPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = calculateExportPrice(importPrice);
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    // phương thức tính giá bán dựa vào giá nhập và hằng số
    private float calculateExportPrice(float importPrice) {
        return importPrice * IShop.RATE;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    // phương thức thêm tác giả vào danh sách
    public void addAuthor(Author author) {
        authorsList.add(author);
    }
    //phương thức hiển thị danh sách tác giả cho người dùng chọn

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
        this.bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sách: ");
        this.title = scanner.nextLine();
        System.out.println("Nhập số lượng trang của sách: ");
        this.numberOfPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá nhập của sách: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập số lượng sách: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trạng thái của sách(true: available, false: not available): ");
        this.bookStatus = Boolean.parseBoolean(scanner.nextLine());
        this.exportPrice = calculateExportPrice(this.importPrice);
        if (authorsList.isEmpty()) {
            System.out.println("Không có tác giả nào trong danh sách.");
        } else {
            System.out.println("Chọn một tác giả từ danh sách sau:");
            for (int i = 0; i < authorsList.size(); i++) {
                Author author = authorsList.get(i);
                System.out.println((i + 1) + ". Mã: " + author.getAuthorId() + " - Tên: " + author.getAuthorName());
            }
            System.out.print("Nhập số thứ tự của tác giả bạn chọn: ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > authorsList.size()) {
                System.out.println("Lựa chọn không hợp lệ. Không có tác giả nào được chọn.");
            } else {
                this.author = authorsList.get(choice - 1);
            }
        }
    }

    @Override
    public void displayData() {
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Tên tác giả: " + (this.author != null ? this.author.getAuthorName() : "Chưa có tác giả"));
        System.out.println("Giá bán sách: " + this.exportPrice);
        System.out.println("Số lượng sách: " + this.quantity);
        System.out.println("Trạng thái sách: " + (this.bookStatus ? "Có sẵn" : "Không có sẵn"));
    }
}
