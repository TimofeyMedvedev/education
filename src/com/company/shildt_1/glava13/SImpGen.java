package com.company.glava13;

class TGen<T, V> {
    T ob1;
    V ob2;

    TGen(T o, V e) {
        ob1 = o;
        ob2 = e;
    }

    void showTypes() {
        System.out.println("Tип Т - это " + ob1.getClass().getName());
        System.out.println("Tип V - это " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

public class SImpGen {
    public static void main(String[] args) {
        TGen<Integer, String> tOb = new TGen<>(88, "Обобщения");
        tOb.showTypes();

        int v = tOb.getOb1();
        System.out.println("Значение: " + v);

        String s = tOb.getOb2();
        System.out.println("Значение: " + s);
    }
}
