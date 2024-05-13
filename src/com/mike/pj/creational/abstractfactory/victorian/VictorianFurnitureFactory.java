package com.mike.pj.creational.abstractfactory.victorian;

import com.mike.pj.creational.abstractfactory.Chair;
import com.mike.pj.creational.abstractfactory.FurnitureFactory;
import com.mike.pj.creational.abstractfactory.Sofa;
import com.mike.pj.creational.abstractfactory.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
