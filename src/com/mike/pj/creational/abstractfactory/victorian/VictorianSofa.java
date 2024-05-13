package com.mike.pj.creational.abstractfactory.victorian;

import com.mike.pj.creational.abstractfactory.Sofa;

import java.util.logging.Logger;

public class VictorianSofa implements Sofa {

    private static final Logger logger = Logger.getLogger(VictorianSofa.class.getName());

    @Override
    public void layDown() {
        logger.info("laying down on the Victorian Sofa");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
