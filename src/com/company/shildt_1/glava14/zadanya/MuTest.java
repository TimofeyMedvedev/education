package com.company.glava14.zadanya;
import java.lang.*;

interface MTest {
    boolean testing(int n);
}

class MuTest {
    public static void main(String[] args) {
        MTest mt;
        mt = (n) -> ((n >= 10) && (n <= 20));
        for(int i = 0; i < 10; i++) {
            int m = (int) (Math.random() + i * 2.4);
            System.out.println("Значение " + m + " входит в диапазон от 10 до 20: " + mt.testing(m));
        }
        System.out.println(mt.testing(10));
        System.out.println(mt.testing(20));
    }
}
