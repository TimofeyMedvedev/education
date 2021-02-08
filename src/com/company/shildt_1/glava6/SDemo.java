package com.company.glava6;

class StaticDemo {
    int x;
    static int y;

    int sum() {
        return x + y;
    }
}

public class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Разумеется, ob1.x и ob2.x независимы");
        System.out.println("ob1.x: " + ob1.x +
                "\nob2.x: " + ob2.x);
        System.out.println();

        System.out.println("Сатическая переменная y - общая");
        StaticDemo.y = 19;
        System.out.println("Присвоить значение StaticDemo.y = 19");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Изменить значение StaticDemo.y на 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
