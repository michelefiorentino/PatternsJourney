package com.mike.pj.creational.prototype;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.height = target.height;
            this.width = target.width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "[x: " + getX()
                + ", y: " + getY()
                + ", color: " + getColor()
                + ", width: " + width
                + ", height: " + height + "]";
    }
}
