package com.mike.pj.structural.adapter;

public class SquareToRoundPegAdapter extends RoundPeg{

    private final SquarePeg squarePeg;

    public SquareToRoundPegAdapter(SquarePeg squarePeg){
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius(){
        return getCircumscribedSquareRadius();
    }

    private double getCircumscribedSquareRadius(){
        return squarePeg.getWidth()*Math.sqrt(2)/2;
    }
}
