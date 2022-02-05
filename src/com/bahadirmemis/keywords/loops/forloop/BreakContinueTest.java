package com.bahadirmemis.keywords.loops.forloop;

public class BreakContinueTest {

    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++){

            if (i == 3){
                continue;
            }

            System.out.println("i: " + i);

            if (i == 7){
                break;
            }

        }
    }
}
