package com.company;

public class DriverRobot extends Robot{
    @Override
    void walk() {
        System.out.println("I can walk faster than by parent robot");
    }
    public void canDrive(){
        System.out.println("I know the basics of driving");
    }
}
