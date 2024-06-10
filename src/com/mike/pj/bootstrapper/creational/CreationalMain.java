package com.mike.pj.bootstrapper.creational;

import com.mike.pj.creational.abstractfactory.artdeco.ArtDecoFurnitureFactory;
import com.mike.pj.creational.abstractfactory.modern.ModernFurnitureFactory;
import com.mike.pj.creational.abstractfactory.victorian.VictorianFurnitureFactory;
import com.mike.pj.creational.factorymethod.LinuxDialog;
import com.mike.pj.creational.factorymethod.WindowsDialog;
import com.mike.pj.creational.prototype.Circle;
import com.mike.pj.creational.prototype.Rectangle;

import java.util.logging.Logger;

public class CreationalMain {

    private static final Logger logger = Logger.getLogger(CreationalMain.class.getName());

    public static void main(String[] args) {
        factoryMethodMain();
        abstractFactoryMain();
        prototypeMain();
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

    public static void prototypeMain(){
        Circle circleA = new Circle();
        circleA.setX(1);
        circleA.setY(2);
        circleA.setColor("red");
        circleA.setRadius(4);

        Rectangle rectangleA = new Rectangle();
        rectangleA.setX(2);
        rectangleA.setY(5);
        rectangleA.setColor("blue");
        rectangleA.setHeight(8);
        rectangleA.setWidth(10);

        logger.info("current circle: " + circleA);
        Circle circleB = new Circle(circleA);
        logger.info("copied circle: " + circleB);

        logger.info("current rect: " + rectangleA);
        Rectangle rectangleB = new Rectangle(rectangleA);
        logger.info("copied rect: " + rectangleB);
    }
}