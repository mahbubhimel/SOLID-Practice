package com.company;

public class TreeCutter implements Gardener{
    @Override
    public void makeGardener() {
        waterPump();
        System.out.println("I am a tree cutter gardener");
    }
}