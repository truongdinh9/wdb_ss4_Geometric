package com.codegym;

public class Rectangle extends Shape{
    private double width =1;
    private double height =1;
    Rectangle(){
    }
    Rectangle(double width, double height){
        this.width=width;
        this.height =height;
    }
    Rectangle(double w, double h, String color, boolean filled){
        super(color,filled);
        width=w;
        height =h;
    }

    public double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }
    double getPermetric(){
        return (width+ height)*2;
    }
    double getArea(){
        return width* height;
    }
   public String toString(){
        return "A Rectangle with width= "+ width+ " and height= "+ height + " which is a subclass of "+ super.toString();
    }
}
