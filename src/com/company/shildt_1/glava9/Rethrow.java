package com.company.glava9;

// повторное генерирование сключений

class Rethr {
    public static void genException() {
        int n[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < n.length; i++) {
            try {
                System.out.println(n[i] + " / " + d[i] + " равно " + n[i] / d[i]);
            } catch (ArithmeticException exc) {
                System.out.println("Попытка деления на нуль!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Соответствующий элемент не найден");
                throw exc;
            }
        }
    }
}

public class Rethrow {
    public static void main(String[] args) {
        try {
            Rethr.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Фатальная ошибка - выполнение программы прервано");
        }
    }
}
