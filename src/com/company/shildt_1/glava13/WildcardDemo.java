package com.company.glava13;

class Numerics<T extends Number> {
    T ob;

    Numerics(T o) {
        ob = o;
    }

    double reciprocal() {
        return 1 / ob.doubleValue();
    }

    double fraction() {
        return ob.doubleValue() - ob.intValue();
    }

    boolean absEquals(Numerics<?> o) {
        if(Math.abs(ob.doubleValue()) == Math.abs(o.ob.doubleValue()))
            return true;
        return false;
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        Numerics<Integer> iOb = new Numerics<>(6);
        Numerics<Double> dOb = new Numerics<>(- 6.0);
        Numerics<Long> lOb = new Numerics<>(5L);

        System.out.println("Сравнение iOb и dOb:");
        if(iOb.absEquals(dOb))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");

        System.out.println();

        System.out.println("Сравнение iOb и lOb:");
        if(iOb.absEquals(lOb))
            System.out.println("Абсолютные значения совпадают");
        else System.out.println("Абсолютные значения отличаются");
    }
}
