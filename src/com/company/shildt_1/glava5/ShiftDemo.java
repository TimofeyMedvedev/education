package com.company.glava5;

public class ShiftDemo {
    public static void main(String[] args) {
        int v = 1;

        for(int i = 0; i < 8; i++) {
            for(int t = 128; t > 0; t = t/2) {
                if((v & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            v = v << 1;
        }
        System.out.println();

        v = 128;
        for(int i = 0; i < 8; i++) {
            for(int t = 128; t > 0; t = t/2) {
                if((v & t) != 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
            v = v >> 1;
        }
    }
}
