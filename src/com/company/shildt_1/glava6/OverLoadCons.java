package com.company.glava6;

class MyClasss {
    int x;

    MyClasss() {
        System.out.println("Внутри MyClasss().");
        x = 0;
    }

    MyClasss(int i) {
        System.out.println("Внутри MyClasss(int).");
        x = i;
    }

    MyClasss(double d) {
        System.out.println("Внутри MyClasss(double).");
        x = (int) d;
    }

    MyClasss(int i, int j) {
        System.out.println("Внутри MyClasss(int, int).");
        x = i * j;
    }
}

public class OverLoadCons {
    public static void main(String[] args) {
        MyClasss t1 = new MyClasss();
        MyClasss t2 = new MyClasss(88);
        MyClasss t3 = new MyClasss(17.23);
        MyClasss t4 = new MyClasss(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
