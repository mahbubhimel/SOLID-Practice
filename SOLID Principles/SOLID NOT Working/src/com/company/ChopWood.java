package com.company;

public class ChopWood implements Gardener{
    @Override
    public void makeGardener() {
        waterPump();
        System.out.println("I am a chop wood gardener");
    }
}