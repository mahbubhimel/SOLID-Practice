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
        b.cooking();
        b.cookKacchi();
        b.biriyaniBasics();

        System.out.println();
        System.out.println("Driving Robot");

        DriverRobot dr = new DriverRobot();
        dr.drive(new Plane());
        RobotSeminar(dr);

        System.out.println();

        CoffeeMakerIsAWoodCutterAndHasACarAndPlane wc = new CoffeeMakerIsAWoodCutterAndHasACarAndPlane();
        wc.showOffVehicleSkill();
        wc.cutWood();
        wc.makeCoffee();


    }
}
