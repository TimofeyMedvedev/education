package com.company.glava6;

public class Zad2 {
    int sum(int... a) {
        int result = 0;

        for(int i = 0; i < a.length; i++)
            result += a[i];
            return result;
    }

    public static void main(String[] args) {
        Zad2 ob = new Zad2();

        int t = ob.sum(1, 2, 3, 4, 5);
        System.out.println("Сумма: " + t);

        t = ob.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Сумма: " + t);
    }
}

