package com.bahadirmemis.solid.dependencyinversion.bad;

public class Test {

    public static void main(String[] args) {

        Lamb lamb = new Lamb();
        Button button = new Button(lamb);
        button.switchIt();
        button.switchIt();
        button.switchIt();
    }
}
