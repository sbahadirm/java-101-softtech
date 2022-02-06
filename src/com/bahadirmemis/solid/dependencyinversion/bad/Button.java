package com.bahadirmemis.solid.dependencyinversion.bad;

class Button {

    private Lamb lamb;

    public Button(Lamb lamb) {
        this.lamb = lamb;
    }

    public void switchIt(){
        lamb.switchIt();
    }
}
