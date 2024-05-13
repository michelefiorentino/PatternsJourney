package com.mike.pj.creational.abstractfactory.victorian;

import com.mike.pj.creational.abstractfactory.Chair;

import java.util.logging.Logger;

public class VictorianChair implements Chair {

    private static final Logger logger = Logger.getLogger(VictorianChair.class.getName());

    @Override
    public void sitOn() {
        logger.info("Sitting on Victorian Chair");
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
