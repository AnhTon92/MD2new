package bai_1.ra.bussinessImp;

import bai_1.ra.bussiness.IShop;

import java.util.Scanner;

public class Author implements IShop {
    // các thuộc tính
    private int authorId;
    private String authorName;
    private Boolean sex;
    private int year;

    public Author() {
    }

    public Author(int authorId, String authorName, Boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã tác giả: ");
        this.authorId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả: ");
        this.authorName = scanner.nextLine();
        System.out.println("Nhập giới tính tác giả(true = male, false = female): ");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập năm sinh: ");
        this.year = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public void displayData() {
        System.out.println("Mã tác giả: " + this.authorId);
        System.out.println("Tên tác giả: " + this.authorName);
    }
}

