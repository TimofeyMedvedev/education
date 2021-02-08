package com.company.glava14;

interface SomeTest<T> {
    boolean test(T n, T m);
}

public class GFIDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isInt = (n, d) -> (n % d) == 0;

        if (isInt.test(10, 2))
            System.out.println("2 является делителем 10");

        SomeTest<Double> isDob = (n, d) -> (n % d) == 0;

        if (isDob.test(212.0, 4.0))
            System.out.println("4.0 является делителем 212.0");

        SomeTest<String> isStr = (a, b) -> a.indexOf(b) != -1;

        String str = "Обобщенный функциональный интерфейс";
        System.out.println("Тестируемая строка: " + str);

        if(isStr.test(str, "qwerty"))
            System.out.println("'qwerty' найдено");
        else System.out.println("'qwerty' не найдено");
    }
}
