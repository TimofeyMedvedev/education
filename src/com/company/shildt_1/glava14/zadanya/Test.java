package com.company.glava14.zadanya;

interface NumericFunc {
    int func(int i);
}

public class Test {
    public static void main(String[] args) {
        NumericFunc nf;

        nf = (n) -> {
            int res = 1;
            for(int i = 1; i <= n; i++)
                res *= i;
            return res;
        };
        System.out.println("Факториал 5: " + nf.func(5));
        System.out.println("Факториал 4: " + nf.func(4));
        System.out.println("Факториал 2: " + nf.func(2));
        System.out.println("Факториал 1: " + nf.func(1));
        System.out.println("Факториал 7: " + nf.func(7));
    }
}
