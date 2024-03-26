package Bai1va2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Square square = new Square(5.0);

        Shape[] shapes = {circle,rectangle,square};
        System.out.println("Truoc khi tang kich thuoc");
        for (Shape a : shapes){
            System.out.println(a);
            if(a instanceof Square tempSquare)
            {
                tempSquare.howToColor();
            }
        }
        circle.resize(Math.random()*100);
        rectangle.resize(Math.random()*100);
        square.resize(Math.random()*100);

        System.out.println("Sau khi tang kich thuoc");
        for (Shape a : shapes){
            System.out.println(a);
        }
    }
}
