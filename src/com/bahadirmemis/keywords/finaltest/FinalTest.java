package com.bahadirmemis.keywords.finaltest;

public class FinalTest {

    public static void main(String[] args) {

        final int i = 5;
//        i = 6;

        FinalTest2 finalTest2 = new FinalTest2();
        finalTest2.print();

        FinalTest3 finalTest3 = new FinalTest3();
        finalTest3.print();
        finalTest3.print3();

    }
}
