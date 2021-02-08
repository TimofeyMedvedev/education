package com.company.glava6;

public class MyClass {
    private int alp;
    public int beta;
    int gam;

    void setAlp(int a) {
        alp = a;
    }
    int getAlp() {
        return alp;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlp(-99);
        System.out.println("ob.alp: " + ob.getAlp());

        ob.beta = 88;
        ob.gam = 99;
    }
}
