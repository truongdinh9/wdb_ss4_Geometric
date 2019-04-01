package com.codegym;

public class Circle extends Shape {
    private double radius=1;


    Circle(){
    }
    Circle(double r){
        radius=r;
    }
    Circle(double r,String color, boolean filled){
        radius=r;
        super.setColor(color);
        super.setFilled(filled);
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "+radius+ " which is a subclass of " + super.toString();
    }
}
