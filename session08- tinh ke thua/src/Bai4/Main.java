package Bai4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shape triangle1 = new Triangle("red", 3.0, 5.0, 2.0);
        Triangle triangle2 = new Triangle("blue", 4.0, 6.0, 8.0);
        System.out.println(triangle1.getColor());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getArea());
        System.out.println(triangle1);
        System.out.println(triangle2);
    }
}
