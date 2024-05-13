package com.mike.pj.bootstrapper.creational;

import com.mike.pj.creational.factorymethod.LinuxDialog;
import com.mike.pj.creational.factorymethod.WindowsDialog;

import java.util.logging.Logger;

public class CreationalMain {

    private static final Logger logger = Logger.getLogger(CreationalMain.class.getName());

    public static void main(String[] args) {
        factoryMethodMain();
    }

    public static void factoryMethodMain(){
        logger.info("Creating OS dialogs!");
        WindowsDialog windowsDialog = new WindowsDialog();
        windowsDialog.render();
        LinuxDialog linuxDialog = new LinuxDialog();
        linuxDialog.render();
    }
}