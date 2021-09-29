package com.company;

public interface DriverBasics {
    default void drive(){
        System.out.println("I can drive!!!");
    }
}