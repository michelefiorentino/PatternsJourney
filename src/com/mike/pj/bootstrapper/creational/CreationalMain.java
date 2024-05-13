package com.mike.pj.bootstrapper.creational;

import com.mike.pj.creational.abstractfactory.artdeco.ArtDecoFurnitureFactory;
import com.mike.pj.creational.abstractfactory.modern.ModernFurnitureFactory;
import com.mike.pj.creational.abstractfactory.victorian.VictorianFurnitureFactory;
import com.mike.pj.creational.factorymethod.LinuxDialog;
import com.mike.pj.creational.factorymethod.WindowsDialog;

import java.util.logging.Logger;

public class CreationalMain {

    private static final Logger logger = Logger.getLogger(CreationalMain.class.getName());

    public static void main(String[] args) {
        factoryMethodMain();
        abstractFactoryMain();
    }

    public static void factoryMethodMain(){
        logger.info("Creating OS dialogs!");
        WindowsDialog windowsDialog = new WindowsDialog();
        windowsDialog.render();
        LinuxDialog linuxDialog = new LinuxDialog();
        linuxDialog.render();
    }

    public static void abstractFactoryMain(){
        logger.info("Creating Furniture!");

        logger.info("Creating Art Deco Furniture...");
        var artDecoFurnitureFactory = new ArtDecoFurnitureFactory();
        artDecoFurnitureFactory.createChair().sitOn();
        artDecoFurnitureFactory.createSofa().layDown();
        artDecoFurnitureFactory.createTable().placeOn("apple");

        logger.info("Creating Modern Furniture...");
        var modernFurnitureFactory = new ModernFurnitureFactory();
        modernFurnitureFactory.createChair().sitOn();
        modernFurnitureFactory.createSofa().layDown();
        modernFurnitureFactory.createTable().placeOn("orange");

        logger.info("Creating Victorian Furniture...");
        var victorianFurnitureFactory = new VictorianFurnitureFactory();
        victorianFurnitureFactory.createChair().sitOn();
        victorianFurnitureFactory.createSofa().layDown();
        victorianFurnitureFactory.createTable().placeOn("banana");
    }
}