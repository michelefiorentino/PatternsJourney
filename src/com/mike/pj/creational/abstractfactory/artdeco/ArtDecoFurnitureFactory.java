package com.mike.pj.creational.abstractfactory.artdeco;

import com.mike.pj.creational.abstractfactory.Chair;
import com.mike.pj.creational.abstractfactory.FurnitureFactory;
import com.mike.pj.creational.abstractfactory.Sofa;
import com.mike.pj.creational.abstractfactory.Table;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
