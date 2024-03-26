package Bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"yellow");
        circle.getArea();

        Cylinder cylinder = new Cylinder(3,"red",4);
        cylinder.cylindricalVolume();
        System.out.println("diện tích hình tròn là:" + circle.getArea());
        System.out.println("thể tích hình trụ là:" + cylinder.cylindricalVolume());
    }
}
