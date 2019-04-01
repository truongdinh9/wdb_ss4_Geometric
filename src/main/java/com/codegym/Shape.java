package com.codegym;

public class Shape {
    private String color="green";
    private boolean filled=true;
    Shape(){ };
    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    @Override
    public String toString() {
       return  "A Shape with color of "+ color + " and "+(filled?  "filled": " not filled" )  ;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    void setFilled(boolean filled) {
        this.filled = filled;
    }
}
