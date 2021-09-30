package com.company;

public class DriverRobot extends Robot{
    @Override
    void walk() {
        System.out.println("I can walk faster than by parent robot");
    }
    public void drive(Vehicle vehicle){
        vehicle.driveVehicle();
    }

    @Override
    void speak() {
        System.out.println("I am speaking from driver robot");
    }
}
