package com.bahadirmemis.solid.dependencyinversion.good;

class Button {

    private Switchable switchable;

    public Button(Switchable switchable) {
        this.switchable = switchable;
    }

    public void switchIt(){
        switchable.switchIt();
    }
}
