package com.mike.pj.creational.prototype;

public class Circle extends Shape {
    private double radius;

    public Circle(){}

    public Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "[x: " + getX()
                + ", y: " + getY()
                + ", color: " + getColor()
                + ", radius: " + radius + "]";
    }
}