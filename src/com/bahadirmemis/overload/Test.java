package com.bahadirmemis.overload;

public class Test {

    public static void main(String[] args) {

        OverloadTest overloadTest = new OverloadTest();
//        overloadTest.print();
//        overloadTest.print("Bahadir");

        overloadTest.print();
        String text = overloadTest.print();
        System.out.println("text: " + text);

    }
}
