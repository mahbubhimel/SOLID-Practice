package com.company;

public class DriverRobotWhoCanDriveCarAndPlane extends DriverRobot implements Car, Plane{
    @Override
    public void driveCar() {
        System.out.println("I can drive toyota");
    }

    @Override
    public void drivePlane() {
        System.out.println("I can drive US Bangla Plane");
    }

    @Override
    public void canDrive() {
        System.out.println("I can drive faster than my parent");
    }
}
