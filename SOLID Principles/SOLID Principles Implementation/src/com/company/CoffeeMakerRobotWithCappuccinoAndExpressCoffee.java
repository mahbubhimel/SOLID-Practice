package com.company;

public class CoffeeMakerRobotWithCappuccinoAndExpressCoffee extends CoffeeMakerRobot implements Cappuccino, ExpressCoffee{
    @Override
    public void makeCappuccino() {
        System.out.println("I can make Cappuccino coffee");
    }

    @Override
    public void makeExpressCoffee() {
        System.out.println("I can make express Coffee");
    }

    @Override
    public void makeCoffee() {
        System.out.println("I can make normal coffee with different ingredients");
    }
}
