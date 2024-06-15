package com.mike.pj.bootstrapper;

import com.mike.pj.structural.adapter.RoundHole;
import com.mike.pj.structural.adapter.RoundPeg;
import com.mike.pj.structural.adapter.SquarePeg;
import com.mike.pj.structural.adapter.SquareToRoundPegAdapter;

import java.util.logging.Logger;

public class StructuralMain {

    private static final Logger logger = Logger.getLogger(StructuralMain.class.getName());

    public static void main(String[] args) {
        adapterMain();
    }

    public static void adapterMain(){
        var hole = new RoundHole(5);

        var roundPeg = new RoundPeg(3);
        logHoleFitsResult(hole, roundPeg);

        var squarePegSmall = new SquarePeg(7);
        var squarePegBig = new SquarePeg(10);
        logHoleFitsResult(hole, new SquareToRoundPegAdapter(squarePegSmall));
        logHoleFitsResult(hole, new SquareToRoundPegAdapter(squarePegBig));
    }

    private static void logHoleFitsResult(RoundHole roundHole, RoundPeg roundPeg){
        logger.info("Do peg fits in hole? hole radius: " + roundHole.getRadius()
                + ", peg radius: " + roundPeg.getRadius()
                + ". So it's " + roundHole.fits(roundPeg));
    }

}
