package Bai5;

public class StaticMethods {
    private static final double Pi = 3.14;
    private static double r;
    private static double width,height;
    private static double a,b,c;

    public StaticMethods() {
    }


    public static double getR() {
        return r;
    }

    public static void setR(double r) {
        StaticMethods.r = r;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        StaticMethods.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        StaticMethods.height = height;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double a) {
        StaticMethods.a = a;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double b) {
        StaticMethods.b = b;
    }

    public static double getC() {
        return c;
    }

    public static void setC(double c) {
        StaticMethods.c = c;
    }

    public static double calCircleArea(double r){
        return Pi*r*r;
    }
    public static double calRectangleArea(double width,double height){
        return width * height;
    }
    public static double calTriangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
