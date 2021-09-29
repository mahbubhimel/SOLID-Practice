package com.company;

public class Cappuccino implements Chef{
    @Override
    public void makeChef() {
        cook();
        System.out.println("I can make cappuccino");
    }
}