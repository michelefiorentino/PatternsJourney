package com.mike.pj.creational.factorymethod;

public class LinuxDialog extends Dialog{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}