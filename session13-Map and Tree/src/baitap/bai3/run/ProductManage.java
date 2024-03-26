package baitap.bai3.run;


import baitap.bai3.business.config.InputMethods;
import baitap.bai3.business.implement.Manage;

public class ProductManage {
    static Manage call = new Manage();

    public static void main(String[] args) {
        do {
            System.out.println("____________MENU____________");
            System.out.println("1: thêm sản phẩm");
            System.out.println("2: update sản phẩm");
            System.out.println("3: xóa sản phẩm");
            System.out.println("4: danh sách sản phẩm sản phẩm");
            System.out.println("5: sắp xếp theo giá tăng dần ");
            System.out.println("6: sắp xếp theo giá giảm dần ");
            System.out.println("7: tìm sản phẩm");
            System.out.println("8: thoát");
            int choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                    call.add();
                    break;
                case 2:
                    call.upDate();
                    break;
                case 3:
                    call.delete();
                    break;
                case 4:
                    call.displayDAta();
                    break;
                case 5:
                    call.sortUp();
                    call.displayDAta();
                    break;
                case 6:
                    call.sortDown();
                    call.displayDAta();
                    break;
                case 7:
                    call.searchByName();
                    break;
                case 8:
                    System.exit(0);
                    break;


            }

        } while (true);
    }
}
