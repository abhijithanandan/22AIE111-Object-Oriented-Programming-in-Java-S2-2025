package org.example;

public class App {

    private int length;
    private int width;

    public App(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        App rectangle = new App(5, 3);
        System.out.println("Area: " + rectangle.getArea());         // 15
        System.out.println("Perimeter: " + rectangle.getPerimeter()); // 16
    }
}

