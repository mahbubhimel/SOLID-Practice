package com.company;

public class GardenerRobotWithWoodChopAndTreeCutAbility extends GardenerRobot implements ChopWood, TreeCutter{

    @Override
    public void chopWood() {
        System.out.println("I am chopping wood");
    }

    @Override
    public void cutTree() {
        System.out.println("I am cutting tree.");
    }
}
