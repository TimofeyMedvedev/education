package com.company.glava13;

class Ge<T> {
    T ob;

    Ge(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

public class RawDemo {
    public static void main(String[] args) {
        Ge<Integer> iOb = new Ge<>(88);
        Ge<String> sOb = new Ge<>("qwerty");
        Ge raw = new Ge(2.3);
        double d = (Double) raw.getOb();
        System.out.println("Значение: " + d);

    }
}
