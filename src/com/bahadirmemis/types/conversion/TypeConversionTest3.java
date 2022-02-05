package com.bahadirmemis.types.conversion;

import java.math.BigDecimal;

public class TypeConversionTest3 {

    public static void main(String[] args) {

        long l3 = 5455555555555555555L;
        int i3 = (int) l3;

//        System.out.println("3:");
//        System.out.println(l3);
//        System.out.println(i3);

        long l4 = 100000000000L;
        int i4 = (int) l4;

//        System.out.println("4:");
//        System.out.println(l4);
//        System.out.println(i4);

        double d5 = 8.11d;
        int i5 = (int) d5;

//        System.out.println("5:");
//        System.out.println(d5);
//        System.out.println(i5);

        long l6 = 2147483649L;
        int i6 = (int) l6; // 2147483648

        System.out.println("6:");
        System.out.println(l6);
        System.out.println(i6);

    }
}
