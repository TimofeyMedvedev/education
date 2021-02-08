package com.company.glava9;

public class Excample3 {
    public static void main(String[] args) {
        int n[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < n.length; i++) {
                try {
                    System.out.println(n[i] + " / " + d[i] + " равно " + n[i] / d[i]);
                } catch (ArithmeticException exc) {
                    System.out.println("Попытка деления на нуль!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Соответствующий элемент не найден");
            System.out.println("Фатальная ошибка - выполнение программы прервано");
        }
    }
}
