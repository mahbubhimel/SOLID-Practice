package com.company;

public interface BasicActivities {
    default void walk(){
        System.out.println("I can walk");
    }
    default void speak(){
        System.out.println("I can speak");
    }
    default void recharge(){
        System.out.println("I can recharge");
    }
}
