package com.company;

public class CoffeeMakerIsAWoodCutterAndHasACarAndPlane extends CoffeeMakerRobot implements WoodCutter{
    @Override
    public void cutWood() {
        System.out.println("I am a wood cutter");
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
    }

    Plane plane = new Plane();
    Car car = new Car();
    public void showOffVehicleSkill(){
        plane.driveVehicle();
        car.driveVehicle();
    }

}
