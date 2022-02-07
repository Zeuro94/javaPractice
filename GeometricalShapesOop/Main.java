package com.company.GeometricalShapesOop;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("dadsa", "sdad");

        Triangle triangle = new Triangle("steel", "sdasdas", 29, 20);
        triangle.setBase(20);
        triangle.setHeight(15);
        Rectangle rectangle = new Rectangle("Asdas", "asdads", 20, 20);

        triangle.displayTriangleHeight();
        rectangle.displayRectangleHeight();

        System.out.println(shape.getSize());
        System.out.println(triangle.getSize());
        System.out.println(rectangle.getSize());

        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(shape.toString());
    }
}
