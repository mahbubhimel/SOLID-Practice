package com.company;

public class Robot implements BasicActivities{
    public void makeGardener(Gardener type){
        walk(); speak(); recharge();
        type.makeGardener();
    }

    public void makeChef(Chef type){
        walk(); speak(); recharge();
        type.makeChef();
    }
    public void makeDriver(Driver type){
        walk(); speak(); recharge();
        type.makeDriver();
    }
}