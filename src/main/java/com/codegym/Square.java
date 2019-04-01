package com.codegym;

public class Square extends Rectangle {
    private double side=1.0;
    Square(){
        super.setWidth(side);
        super.setHeigh(side);
    }
    Square(double side){
        super(side,side);
        this.side=side;
    }
    Square(double side,String color, boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.setWidth(side);
        this.side = side;
    }
    public String toString(){
        return "A Square with side= "+ side+", which is a subclass of "+ super.toString();
    }
}
