package com.bahadirmemis.str;

import com.bahadirmemis.people.People;

public class StringTest {

    public static void main(String[] args) {

        People people1 = new People();

        People people2 = people1;

        System.out.println("1:");
        System.out.println(people1.getName());
        System.out.println(people2.getName());

        people2.setName("Bahadir");

        System.out.println("2:");
        System.out.println(people1.getName());
        System.out.println(people2.getName());
    }
}
