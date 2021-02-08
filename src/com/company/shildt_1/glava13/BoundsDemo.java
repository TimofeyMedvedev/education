package com.company.glava13;

class Numeric<T extends Number> {
    T ob;

    Numeric(T o) {
        ob = o;
    }

    double reciprocal() {
        return 1 / ob.doubleValue();
    }

    double fraction() {
        return ob.doubleValue() - ob.intValue();
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        Numeric<Integer> ob = new Numeric<>(5);
        System.out.println("Обратная величина ob - " + ob.reciprocal());
        System.out.println("Дробная часть ob - " + ob.fraction());

        System.out.println();

        Numeric<Double> ob1 = new Numeric<>(5.25);
        System.out.println("Обратная величина ob1 - " + ob1.reciprocal());
        System.out.println("Дробная часть ob1 - " + ob1.fraction());
    }
}
