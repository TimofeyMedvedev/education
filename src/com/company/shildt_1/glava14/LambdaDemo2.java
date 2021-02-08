package com.company.glava14;

interface StringTest {
    boolean test(String s1, String s2);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Это тест";

        System.out.println("Тестируемая строка: " + str);

        if(isIn.test(str, "Это"))
            System.out.println("'Это' найдено");
        else System.out.println("'Это' не найдено");

        if(isIn.test(str, "qwerty"))
            System.out.println("'qwerty' найдено");
        else System.out.println("'qwerty' не найдено");
    }
}
