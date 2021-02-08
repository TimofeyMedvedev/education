package com.company.glava6;

public class Zad1 {
    String str;

    Zad1(String s) {
        str = s;
    }
    void recurs(int idx) {
        if(idx != (str.length() - 1)) recurs(idx + 1);
        System.out.print(str.charAt(idx));
    }

    public static void main(String[] args) {
        Zad1 s = new Zad1("This is a test");

        s.recurs(0);
    }
}
