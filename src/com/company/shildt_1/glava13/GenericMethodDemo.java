package com.company.glava13;

public class GenericMethodDemo {

    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length)
            return false;

        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};
        Integer n1[] = {1, 2, 3, 4, 5};
        Integer n2[] = {1, 2, 7, 4, 5};
        Integer n3[] = {1, 2, 7, 4, 5, 6};

        if(arraysEqual(n, n))
            System.out.println("n эвивалентен n");
        if(arraysEqual(n, n1))
            System.out.println("n эвивалентен n1");
        if(arraysEqual(n, n2))
            System.out.println("n эвивалентен n2");
        if(arraysEqual(n, n3))
            System.out.println("n эвивалентен n3");
    }
}
