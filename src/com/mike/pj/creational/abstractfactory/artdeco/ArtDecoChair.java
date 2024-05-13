package com.mike.pj.creational.abstractfactory.artdeco;

import com.mike.pj.creational.abstractfactory.Chair;

import java.util.logging.Logger;

public class ArtDecoChair implements Chair {

    private static final Logger logger = Logger.getLogger(ArtDecoChair.class.getName());

    @Override
    public void sitOn() {
        logger.info("Sitting on Art Deco Chair");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}