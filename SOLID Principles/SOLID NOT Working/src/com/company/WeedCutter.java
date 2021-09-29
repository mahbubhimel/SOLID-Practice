package com.company;

public class WeedCutter implements  Gardener {

    @Override
    public void makeGardener() {
        waterPump();
        System.out.println("I am a weed cutter gardener");
    }
}