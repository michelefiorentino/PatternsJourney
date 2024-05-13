package com.mike.pj.creational.abstractfactory.modern;

import com.mike.pj.creational.abstractfactory.Chair;
import com.mike.pj.creational.abstractfactory.FurnitureFactory;
import com.mike.pj.creational.abstractfactory.Sofa;
import com.mike.pj.creational.abstractfactory.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
