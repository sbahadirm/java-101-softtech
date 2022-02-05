package com.bahadirmemis.keywords.loops.forloop;

public class IfTest {

    public static void main(String[] args) {

        int i = getI();

        if (i == 1){
            System.out.println("one");
        } else if (i == 2){
            System.out.println("two");
        } else if (i == 5){
            System.out.println("five");
        } else {
            System.out.println("I have no idea");
        }
    }

    private static int getI() {
        int i = 6;
        return i;
    }
}
