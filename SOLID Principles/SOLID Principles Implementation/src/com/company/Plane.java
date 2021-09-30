package com.company;

public class Plane implements Vehicle {

  @Override
  public void driveVehicle() {
    System.out.println("I can fly Plane");
  }

  public void hi(){
    System.out.println("Hi");
  }
}
