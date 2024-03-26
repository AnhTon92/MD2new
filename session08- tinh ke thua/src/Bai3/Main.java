package Bai3;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Point point = new Point(1.0F, 2.0F);
        MoveablePoint moveablePoint = new MoveablePoint(3.0F, 3.0F, 6.0F, 7.0F);
        System.out.println(point);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.Move().toString());
        System.out.println(moveablePoint);
    }
}
