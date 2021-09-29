package com.company;

public class Car implements Driver{
    @Override
    public void makeDriver() {
        drive();
        System.out.println("I can drive Car");
    }
}