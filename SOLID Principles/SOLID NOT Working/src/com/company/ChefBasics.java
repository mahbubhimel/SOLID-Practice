package com.company;

public interface ChefBasics {
    default void cook(){
        System.out.println("I can cook!!!");
    }
}