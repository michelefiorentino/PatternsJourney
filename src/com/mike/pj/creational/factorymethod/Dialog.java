package com.mike.pj.creational.factorymethod;

import java.util.logging.Logger;

public abstract class Dialog {

    private static final Logger logger = Logger.getLogger(Dialog.class.getName());

    public abstract Button createButton();

    public void render(){
        logger.info("rendering button...");
        createButton().render();
    }

}
