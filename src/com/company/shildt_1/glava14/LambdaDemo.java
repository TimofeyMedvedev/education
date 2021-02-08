package com.company.glava14;

interface NumericTest {
    boolean test(int n, int m);
}

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 является делителем 10");
        if(!isFactor.test(10, 3))
            System.out.println("3 не является делителем 10");
        System.out.println();

        NumericTest lessThan = (n, m) -> (n < m);

        if(lessThan.test(2, 10))
            System.out.println("2 меньше 10");
        if(!lessThan.test(10, 2))
            System.out.println("10 не меньше 2");
        System.out.println();

        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if(absEqual.test(4, -4))
            System.out.println("Абсолютные величины 4 и -4 равны");
        if(!absEqual.test(4, -5))
            System.out.println("Абсолютные величины 4 и -5 не равны");
    }
}
