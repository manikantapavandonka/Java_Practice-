package com.inheritance;

abstract class Shape {

    String color;

    abstract void calculateArea();

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {

    int radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {

    int length;
    int width;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area: " + area);
    }
}

public class Example20 {

    public static void main(String[] args) {

        Shape s = new Circle();

        System.out.println("Circle");

        s.color = "Red";

        Circle c = (Circle) s;
        c.radius = 5;

        s.displayColor();
        s.calculateArea();

        System.out.println();

        Shape s1 = new Rectangle();

        System.out.println("Rectangle");

        s1.color = "Blue";

        Rectangle r = (Rectangle) s1;
        r.length = 20;
        r.width = 10;

        s1.displayColor();
        s1.calculateArea();
    }
}