package com.mike.pj.creational.factorymethod;

import java.util.logging.Logger;

public class LinuxButton implements Button{

    private static final Logger logger = Logger.getLogger(LinuxButton.class.getName());

    @Override
    public void render() {
        logger.info("Linux button is rendered!");
    }
}