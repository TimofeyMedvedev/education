package com.company.glava13;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Tип Т - это " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение: "+ v);

        System.out.println();

        Gen<String> sOb = new Gen<>("Тестирование обобщений");
        sOb.showType();
        String e = sOb.getOb();
        System.out.println("Значение: "+ e);
    }
}
