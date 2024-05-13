package com.mike.pj.creational.abstractfactory.artdeco;

import com.mike.pj.creational.abstractfactory.Table;

import java.util.logging.Logger;

public class ArtDecoTable implements Table {

    private static final Logger logger = Logger.getLogger(ArtDecoTable.class.getName());

    @Override
    public void placeOn(String object) {
        String mex = object + " is placed on the Art Deco table";
        logger.info(mex);
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
