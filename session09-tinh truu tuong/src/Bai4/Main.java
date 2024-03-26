package Bai4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red",3,5);
        rectangle.getArea();
        rectangle.display();
        System.out.println("diện tich hinhh chư nhât" + rectangle.getArea());
        System.out.println("----------------------------------------");

        Shape circle = new Circle("blue",7);
        circle.getArea();
        circle.display();
        System.out.println("dien tich hình tròn là :"+ circle.getArea());
    }
}
