package com.company;

public class Main {

    public static void main(String[] args) {
        Robot r = new Robot();

        r.makeGardener(new WeedCutter());
        System.out.println();
        r.makeChef(new BiriyaniMaker());
        System.out.println();
        r.makeDriver(new Plane());
    }

}

