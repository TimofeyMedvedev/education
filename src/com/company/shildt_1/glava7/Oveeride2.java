package com.company.glava7;

class A2 {
    int i, j;
    A2(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B2 extends A2 {
    int k;
    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}
public class Oveeride2 {
    public static void main(String[] args) {
        B2 ob = new B2(1, 2, 3);
        ob.show("k: " );
        ob.show();
    }
}