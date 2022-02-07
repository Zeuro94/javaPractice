package com.company.GeometricalShapesOop;

public class Shape {
    protected String text;
    protected String material;

    public Shape() {
    }

    public Shape(String text, String material) {
        this.text = text;
        this.material = material;
    }

    public int getSize() {
        return -1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Made of " + material +" contains the text: " + text;
    }
}
