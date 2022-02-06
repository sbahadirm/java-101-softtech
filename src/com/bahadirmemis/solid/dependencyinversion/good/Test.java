package com.bahadirmemis.solid.dependencyinversion.good;

public class Test {

    public static void main(String[] args) {

        Lamb lamb = new Lamb();
        Button lambButton = new Button(lamb);
        lambButton.switchIt();
        lambButton.switchIt();
        lambButton.switchIt();

        Fridge fridge = new Fridge();
        Button fridgeButton = new Button(fridge);
        fridgeButton.switchIt();
        fridgeButton.switchIt();
        fridgeButton.switchIt();
    }
}
