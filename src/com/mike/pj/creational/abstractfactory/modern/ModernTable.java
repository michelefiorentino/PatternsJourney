package com.mike.pj.creational.abstractfactory.modern;

import com.mike.pj.creational.abstractfactory.Table;

import java.util.logging.Logger;

public class ModernTable implements Table {

    private static final Logger logger = Logger.getLogger(ModernTable.class.getName());

    @Override
    public void placeOn(String object) {
        String mex = object + " is placed on the Modern table";
        logger.info(mex);
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}