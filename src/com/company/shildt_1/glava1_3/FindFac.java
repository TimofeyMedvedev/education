package com.company.glava1_3;

public class FindFac {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            int e = i/2;
            for(int j = 2; j <= e; j++) {
                if ((i % j) == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
