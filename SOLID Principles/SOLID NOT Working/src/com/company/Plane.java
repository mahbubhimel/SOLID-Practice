package com.company;

public class Plane implements Driver{
    @Override
    public void makeDriver() {
        drive();
        System.out.println("I can drive a plane");
    }
}