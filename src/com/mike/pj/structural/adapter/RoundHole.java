package com.mike.pj.structural.adapter;

public class RoundHole {

    private final double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg){
        return radius >= peg.getRadius();
    }

    public double getRadius(){
        return radius;
    }
}
