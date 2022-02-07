package com.company.GeometricalShapesOop;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void displayTriangleHeight() {
        System.out.println("Height is: " + height);
    }

    @Override
    public int getSize() {
        return (base * height) / 2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle: height is " + height + " base is: " + base + " made of" + material + " contains the text" + text;
    }
}
