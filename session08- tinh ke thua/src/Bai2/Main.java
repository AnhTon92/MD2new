package Bai2;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,2);
        System.out.println("đây là tọa độ 2d");
        System.out.println(point2D.toString());
        point2D.setXY(2,3);
        System.out.println("tọa độ sau thay đổi");
        System.out.println(point2D.toString());



        Point3D point3D = new Point3D(3);
        System.out.println("đây là tọa độ 3d");
        System.out.println(point3D.toString());
        point3D.setXYZ(5,6,7);
        System.out.println("tọa độ sau thay đổi");
        System.out.println(point3D.toString());
    }
}
