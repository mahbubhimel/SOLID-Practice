package com.company;

public class Bike implements Driver {

    @Override
    public void makeDriver() {
        drive();
        System.out.println("I can drive Bike");
    }
}