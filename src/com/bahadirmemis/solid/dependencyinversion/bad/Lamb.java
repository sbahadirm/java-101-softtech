package com.bahadirmemis.solid.dependencyinversion.bad;

class Lamb {

    private boolean isTurnedOn;

    private void turnOn(){
        System.out.println("on");
        isTurnedOn = true;
    }

    private void turnOff(){
        System.out.println("off");
        isTurnedOn = false;
    }

    public void switchIt(){
        if (isTurnedOn){
            turnOff();
        } else {
            turnOn();
        }
    }
}
