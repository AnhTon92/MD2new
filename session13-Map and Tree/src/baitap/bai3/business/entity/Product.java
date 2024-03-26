package baitap.bai3.business.entity;

import baitap.bai3.business.config.InputMethods;

public class Product {
    private int productID;
    private String productName;
    private double price;

    public Product() {
    }

    public Product(int productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    public void inputData() {

        productID=(int)(Math.random()*9999999);
        System.out.println("mời bạn nhập vào tên sản phẩm: ");
        productName = InputMethods.getString();
        System.out.println("mời bạn nhập vào giá sản phẩm: " );
        price=InputMethods.getDouble();
    }
}
