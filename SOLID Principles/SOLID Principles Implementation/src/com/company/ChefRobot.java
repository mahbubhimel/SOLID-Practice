package com.company;

public class ChefRobot extends Robot{
    public void cooking(){
        System.out.println("I can cook by default");
    }

    @Override
    void speak() {
        System.out.println("I am speaking from chef robot");
    }
}
