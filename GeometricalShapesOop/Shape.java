package com.company.GeometricalShapesOop;

public class Shape {
    private String text;
    private String material;

    public Shape(){
    }

    public Shape(String text, String material){
        setText(text);
        setMaterial(material);
    }

    void setText(String text){this.text = text;}
    void setMaterial(String material){this.material= material;}

    public void getSize(){
        throw new IllegalArgumentException("Can not be calculated");
    }
}
