package com.company.glava14.zadanya;

interface MyFunc<T> {
    T func(T n);
}

public class Test2 {
    public static void main(String[] args) {
        MyFunc<Integer> nf;

        nf = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println("Факториал 5: " + nf.func(5));

        MyFunc<Double> nd;

        nd = (n) -> {
            double res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        System.out.println("Факториал 5: " + nd.func(5.0));
    }
}
