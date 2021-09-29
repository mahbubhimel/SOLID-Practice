package com.company;

public class NormalCoffee implements Chef {

    @Override
    public void makeChef() {
        cook();
        System.out.println("I can make Normal Coffee");
    }
}