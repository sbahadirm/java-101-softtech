package com.bahadirmemis.overload;

public class OverloadTest {

//    public void print(){
//        System.out.println("Hello");
//    }

    public void print(String text){
        System.out.println("Hello " + text);
    }

    public String print(){
        String text = "Hello";
        System.out.println(text);

        return text;
    }
}
