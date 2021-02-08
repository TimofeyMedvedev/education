package com.company.glava7;

class A1 {
    int i, j;
    A1(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B1 extends A1 {
    int k;
    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
public class Oveeride {
    public static void main(String[] args) {
        B1 ob = new B1(1, 2, 3);
        ob.show();
    }
}
