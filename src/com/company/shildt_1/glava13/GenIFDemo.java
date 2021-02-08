package com.company.glava13;

interface Containment<T> {
    boolean contains(T o);
}

class MyClas<T> implements Containment<T> {
    T[] arrayRef;

    MyClas(T[] o) {
        arrayRef = o;
    }

    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
            return false;
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};
        MyClas<Integer> ob = new MyClas<>(x);

        if(ob.contains(2))
            System.out.println("2 содержится в ob");
        else System.out.println("2 НЕ содержится в ob");

        if(ob.contains(5))
            System.out.println("5 содержится в ob");
        else System.out.println("5 НЕ содержится в ob");
    }
}
