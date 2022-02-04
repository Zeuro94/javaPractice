package com.company.GeometricalShapesOop;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle() {

    }

    public Rectangle(String text, String material) {
        setText(text);
        setMaterial(material);
    }

    private int setWidth(int width) {
        return this.width = width;
    }

    private int setHeight(int height) {
        return this.height = height;
    }

    public void displayRectangleHeight(int height) {
        System.out.println("Rectangle height is: " + setHeight(height));
    }

    public void getSize(int height, int width) {
        int size = setHeight(height) * setWidth(width);
        System.out.println("Aria is " + size);
    }
}
