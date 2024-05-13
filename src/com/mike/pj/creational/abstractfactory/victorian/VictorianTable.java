package com.mike.pj.creational.abstractfactory.victorian;

import com.mike.pj.creational.abstractfactory.Table;

import java.util.logging.Logger;

public class VictorianTable implements Table {

    private static final Logger logger = Logger.getLogger(VictorianTable.class.getName());

    @Override
    public void placeOn(String object) {
        String mex = object + " is placed on the Victorian table";
        logger.info(mex);
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
