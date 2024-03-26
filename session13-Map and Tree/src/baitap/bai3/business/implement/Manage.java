package baitap.bai3.business.implement;




import baitap.bai3.business.config.InputMethods;
import baitap.bai3.business.design.Crud;
import baitap.bai3.business.entity.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manage implements Crud
{
    public static List<Product> productList = new ArrayList<>();

    @Override
    public void add() {
        Product newProduct = new Product();
        newProduct.inputData();
        productList.add(newProduct);
    }

    @Override
    public void delete() {
        System.out.println("mời bạn nhập vào id của phần tử muốn xóa:");
        int deleteId = InputMethods.getInteger();
        for (Product product : productList) {
            if (product.getProductID()==deleteId){
                productList.remove(product);
            }
        }

    }

    @Override
    public void upDate() {
        System.out.println("mời bạn nhập vào id của phần tử muốn sửa:");
        int upDateId = InputMethods.getInteger();
        for (Product product : productList) {
            if (product.getProductID()==upDateId){
                boolean flag = true;
                do {
                    System.out.println(product);
                    System.out.println("mời bạn chon trường muốn sửa");
                    System.out.println("1: tên");
                    System.out.println("2: giá");
                    System.out.println("0: hoàn thành");
                    int updateElement = InputMethods.getInteger();
                    switch (updateElement) {
                        case 1:
                            System.out.println("mời bạn nhập vào tên mới:");
                            String newName = InputMethods.getString();
                            product.setProductName(newName);
                            break;
                        case 2:
                            System.out.println("mời bạn nhập vào giá mới:");
                            String newPrice = InputMethods.getString();
                            product.setProductName(newPrice);
                            break;
                        case 0:
                            flag=false;
                            break;
                        default:
                            System.out.println(
                                    "sai lệnh"
                            );
                            break;
                    }
                }
                while (flag) ;
            }
        }

    }

    @Override
    public void displayDAta() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void sortUp() {

        //giá tăng dần
        // productList.sort((o1,o2)-> (int) (o1.getPrice()-o2.getPrice()));
        // ép kiểu int có khả năng sảy ra lỗi VD: "12.5" sẽ bằng "12.4" khi ép về kiểu int
        productList.sort(Comparator.comparingDouble(Product::getPrice));

    }

    @Override
    public void sortDown() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }

    @Override
    public void searchByName() {
        System.out.println("mời bạn nhập vào tên của phần tử tên sản phẩm muốn tìm:");
        String name = InputMethods.getString();
        for (Product product : productList) {
            if (name.contains(product.getProductName())){
                System.out.println(product);
            }
        }

    }
}
