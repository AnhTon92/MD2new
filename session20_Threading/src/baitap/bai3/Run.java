package baitap.bai3;

public class Run {
    public static void main(String[] args) {
        SoChan soChan = new SoChan();// khởi tạo đối tượng của số chẵn
        soChan.start();
        SoLe soLe = new SoLe();// khởi tạo đối tượng số lẻ
        Thread soLe1 = new Thread(soLe);// bọc trong thread để khởi động
        soLe1.start();
    }
}
