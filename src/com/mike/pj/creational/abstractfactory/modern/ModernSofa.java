package com.mike.pj.creational.abstractfactory.modern;

import com.mike.pj.creational.abstractfactory.Sofa;

import java.util.logging.Logger;

public class ModernSofa implements Sofa {

    private static final Logger logger = Logger.getLogger(ModernSofa.class.getName());

    @Override
    public void layDown() {
        logger.info("laying down on the Modern Sofa");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}