package com.mike.pj.creational.factorymethod;

import java.util.logging.Logger;

public class WindowsButton implements Button{

    private static final Logger logger = Logger.getLogger(WindowsButton.class.getName());

    @Override
    public void render() {
        logger.info("Windows button is rendered!");
    }
}
