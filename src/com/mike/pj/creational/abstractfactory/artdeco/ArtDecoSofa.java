package com.mike.pj.creational.abstractfactory.artdeco;

import com.mike.pj.creational.abstractfactory.Sofa;

import java.util.logging.Logger;

public class ArtDecoSofa implements Sofa {

    private static final Logger logger = Logger.getLogger(ArtDecoSofa.class.getName());

    @Override
    public void layDown() {
        logger.info("laying down on the Art Deco Sofa");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}