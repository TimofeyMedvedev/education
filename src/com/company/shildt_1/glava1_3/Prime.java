package com.company.glava1_3;

public class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean ost;

        for(i = 2; i < 100; i++) {
            ost = true;
            for(j = 2; j <= i / j; j++)
                if ((i % j) == 0) ost = false;
            if(ost)
                System.out.println(i + " - простое число.");
        }

    }
}
