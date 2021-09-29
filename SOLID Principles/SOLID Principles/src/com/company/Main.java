package com.company;

public class Main {

    public  static  void RobotSeminar(Robot r){
        r.recharge();
        r.walk();
        r.speak();
    }
    public static void main(String[] args) {

        GardenerRobot g = new GardenerRobot();
        RobotSeminar(g);
        g.wateringPlant();

        System.out.println();

        GardenerRobotWithWoodChopAndTreeCutAbility g1 = new GardenerRobotWithWoodChopAndTreeCutAbility();
        RobotSeminar(g1);
        g1.cutTree();
        g1.chopWood();
        g1.wateringPlant();

        System.out.println();
        System.out.println("Coffee maker ");

        CoffeeMakerRobotWithCappuccinoAndExpressCoffee c = new CoffeeMakerRobotWithCappuccinoAndExpressCoffee();
        RobotSeminar(c);
        c.makeCappuccino();
        c.makeExpressCoffee();
        c.makeCoffee();

        System.out.println();
        System.out.println("Biriyani Cooking ");

        BiriyaniMakerRobotWithKacchiBiriyani b = new BiriyaniMakerRobotWithKacchiBiriyani();
        RobotSeminar(b);
        b.cookKacchi();
        b.biriyaniBasics();

        System.out.println();
        System.out.println("Driving Robot");
        DriverRobotWhoCanDriveCarAndPlane cp = new DriverRobotWhoCanDriveCarAndPlane();
        RobotSeminar(cp);
        cp.canDrive();
        cp.driveCar();
        cp.drivePlane();

        System.out.println();

        DriverRobotWhoCanDrivePlaneAndBike pb = new DriverRobotWhoCanDrivePlaneAndBike();
        pb.drivePlane();
        pb.driveBike();


    }
}
