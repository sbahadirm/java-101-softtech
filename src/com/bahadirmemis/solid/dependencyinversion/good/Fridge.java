package com.bahadirmemis.solid.dependencyinversion.good;

public class Fridge implements Switchable{

    private boolean isTurnedOn;

    private void turnOn(){
        System.out.println("on");
        isTurnedOn = true;
    }

    private void turnOff(){
        System.out.println("off");
        isTurnedOn = false;
    }

    @Override
    public void switchIt() {
        System.out.print("Fridge: ");
        if (isTurnedOn){
            turnOff();
        } else {
            turnOn();
        }
    }
}
