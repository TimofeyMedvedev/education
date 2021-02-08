package com.company.glava5;

public class NoZeroDiv {
    public static void main(String[] args) {
        int r;

        for(int i = -5; i < 6; i++) {
            r = i != 0 ? 100/i : 0;
            if(i != 0)
                System.out.println("100 / " + i + " равно " + r);
        }
        System.out.println();

        for(int i = -5; i < 6; i++)
            if(i != 0 ? true : false)
                System.out.println("100 / " + i + " равно " + 100/i);
    }
}
