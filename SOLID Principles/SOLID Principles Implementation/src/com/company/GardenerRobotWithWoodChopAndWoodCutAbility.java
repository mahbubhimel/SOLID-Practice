package com.company;

public class GardenerRobotWithWoodChopAndWoodCutAbility extends GardenerRobot implements ChopWood, WoodCutter{

    @Override
    public void chopWood() {
        System.out.println("I am chopping wood");
    }

    @Override
    public void cutWood() {
        System.out.println("I am cutting wood.");
    }
}
