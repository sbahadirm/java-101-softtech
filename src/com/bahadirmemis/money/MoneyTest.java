package com.bahadirmemis.money;

import java.math.BigDecimal;

public class MoneyTest {

    public static void main(String[] args) {

        float multiplyF = 0.1f * 0.1f;
        float sumF = 0.1f + 0.1f +0.1f +0.1f +0.1f +0.1f +0.1f;

        double multiplyD = 0.1d * 0.1d;
        double sumD = 0.1d + 0.1d +0.1d +0.1d +0.1d +0.1d +0.1d +
                0.1d + 0.1d +0.1d +0.1d +0.1d +0.1d +0.1d + 0.1d;

        System.out.println("Float:");
        System.out.println(multiplyF);
        System.out.println(sumF);

        System.out.println("Double");
        System.out.println(multiplyD);
        System.out.println(sumD);

        BigDecimal b1 = new BigDecimal("0.1");

        BigDecimal multiplyB = b1.multiply(b1);

        System.out.println("Bigdecimal");
        System.out.println(multiplyB);
    }
}
