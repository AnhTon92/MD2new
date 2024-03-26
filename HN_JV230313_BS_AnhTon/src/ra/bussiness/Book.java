package ra.bussiness;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {

    }
    public Book(int bookId, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest ,boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
        calinterest();
    }
    // Getter and setter


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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }


    //phương thức nhâập dữ liệu
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        // nhập tên sách
        System.out.println("nhập tên sách: ");
        bookName = sc.nextLine();
        while (bookName.length() <= 0) {
            System.out.println("tên sách không được để trống, mời nhập lại: ");
            bookName = sc.nextLine();
        }
        // nhập tác giả
        System.out.println("nhập tên tác giả: ");
        author = sc.nextLine();
        while (author.length() <= 0) {
            System.out.println("tên tác giả không được để trống, mời nhập lại: ");
            author = sc.nextLine();
        }
        //nhập mô tả sách
        System.out.println("Nhập mô tả sách (ít nhất 10 ký tự): ");
        descriptions = sc.nextLine();
        while (descriptions.length() < 10) {
            System.out.println("Mô tả sách phải ít nhất 10 ký tự. Nhập lại: ");
            descriptions = sc.nextLine();
        }
        //nhập giá nhập
        System.out.println("nhập giá nhập: ");
        importPrice = sc.nextDouble();
        while (importPrice <= 0) {
            System.out.println("giá nhập phải lớn hơn 0. Nhập lại: ");
            importPrice = sc.nextDouble();
        }
        // nhập giá xuất
        do {
            System.out.print("Nhập giá xuất ( > giá nhập + 20%): ");
            exportPrice = sc.nextFloat();
        } while (exportPrice <= importPrice * 1.2 );
        // nhập trạng thái
        System.out.println("nhập trạng thái của sách (true/false): ");
        bookStatus = sc.nextBoolean();

    }
    // phương thức tính lợi nhuận
    private void calinterest() { interest = (float) (exportPrice - importPrice);
    }
    // phương thức hiển thị
    public void displayData() {
        System.out.println("-----------------------");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println("Mô tả: " + descriptions);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Trạng thái: " + (bookStatus ? "Còn hàng" : "Hết hàng"));
        System.out.println("-----------------------");
    }
}
