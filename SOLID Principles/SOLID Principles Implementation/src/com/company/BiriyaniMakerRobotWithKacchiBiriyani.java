package com.company;

public class BiriyaniMakerRobotWithKacchiBiriyani extends BiriyaniMaker implements KacchiBiriyani{
    @Override
    public void cookKacchi() {
        System.out.println("I can cook beef kacchi");
    }

    @Override
    public void biriyaniBasics() {
        System.out.println("I can cook different types of biriyani");
    }
}
