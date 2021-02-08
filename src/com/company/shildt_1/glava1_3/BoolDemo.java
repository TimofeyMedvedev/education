package com.company.glava1_3;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = true;
        System.out.println("Значение b: " + b);
        b = false;
        System.out.println("Значение b: " + b);

        if(b) System.out.println("Эта инсрукция не выполняется");
        b = true;
        if(b) System.out.println("Эта инструкция выполняется");
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}
