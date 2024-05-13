package com.mike.pj.creational.abstractfactory.modern;

import com.mike.pj.creational.abstractfactory.Chair;

import java.util.logging.Logger;

public class ModernChair implements Chair {

    private static final Logger logger = Logger.getLogger(ModernChair.class.getName());

    @Override
    public void sitOn() {
        logger.info("Sitting on Modern Chair");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}