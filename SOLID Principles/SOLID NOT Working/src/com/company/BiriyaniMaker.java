package com.company;

public class BiriyaniMaker implements Chef{
    @Override
    public void makeChef() {
        cook();
        System.out.println("I can make biriyani");
    }
}