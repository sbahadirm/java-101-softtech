package com.bahadirmemis.keywords.loops.forloop;

public class SwitchTest {

    public static void main(String[] args) {

        int i = getI();

        switch (i){
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 5:
                System.out.println("five");
                break;

            case 10:
            case 11:
                System.out.println("ten or eleven");
                break;

            default:
                System.out.println("I have no idea");
                break;
        }
    }

    private static int getI() {
        int i = 11;
        return i;
    }
}
