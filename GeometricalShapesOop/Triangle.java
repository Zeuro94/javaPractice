package com.company.GeometricalShapesOop;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height){
        setBase(base);
        setHeight(height);
    }

    public Triangle(){

    }

    public Triangle(String text, String material){
        setText(text);
        setMaterial(material);
    }

    private int setBase(int base){
        return  this.base = base;
    }

     private int setHeight(int height){
         return  this.height = height;
    }

    public void displayTriangleHeight(int height){
        System.out.println("Triangle height is: " + setHeight(height));
    }

    public void getSize(int base, int height){

        int size = (setBase(base) + setHeight(height)) / 2;
        System.out.println("Aria is: " + size);
    }

}
