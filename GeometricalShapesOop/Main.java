package com.company.GeometricalShapesOop;

public class Main {
    public static void main(String[] args) {
        var triangle = new Triangle(20,20);
        var shape = new Shape();
        triangle.displayTriangleHeight(10);
        var rectangle = new Rectangle();
        rectangle.displayRectangleHeight(20);
        triangle.getSize(20,20);
        rectangle.getSize(20, 20);

    }
}
