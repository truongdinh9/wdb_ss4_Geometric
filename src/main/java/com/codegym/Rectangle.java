package com.codegym;

public class Rectangle extends Shape{
    private double width =1;
    private double heigh =1;
    Rectangle(){
    }
    Rectangle(double width, double heigh){
        this.width=width;
        this.heigh=heigh;
    }
    Rectangle(double w, double h, String color, boolean filled){
        super(color,filled);
        width=w;
        heigh=h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    double getPermetric(){
        return (width+heigh)*2;
    }
    double getArea(){
        return width*heigh;
    }
   public String toString(){
        return "A Rectangle with width= "+ width+ " and heigh= "+heigh+ " which is a subclass of "+ super.toString();
    }
}
