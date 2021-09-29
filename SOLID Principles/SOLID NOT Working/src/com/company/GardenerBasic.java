package com.company;

public interface GardenerBasic {
    default void waterPump(){
        System.out.println("I can pump water");
    }
}