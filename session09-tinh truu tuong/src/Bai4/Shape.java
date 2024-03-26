package Bai4;

public class Shape {
    private String color;


    public Shape() {
    }

    public Shape(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public void display(){
        System.out.println("color là:" + this.color);
    }
}
