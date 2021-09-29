package com.company;

public class DriverRobotWhoCanDrivePlaneAndBike extends DriverRobot implements Plane, Bike{
    @Override
    public void driveBike() {
        System.out.println("I can drive R15 V3");
    }

    @Override
    public void drivePlane() {
        System.out.println("I can drive Qatar Airways");
    }
}
