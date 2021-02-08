package com.company.glava9;

import com.company.javarush.uroven1_7.User;

class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }
        }
        catch (ArithmeticException exc) {
            System.out.println("Попытка деления на нуль!");
            return;
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Соответствующий элемент не найден");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }
}

public class FinallyDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
