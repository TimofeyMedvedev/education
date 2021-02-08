package com.company.glava9.zadanie10;

public class Zad10 {
    public static void main(String[] args) {
        Stack stk1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};
        Stack stk2 = new Stack(name);

        char ch;
        int i;

        try {
            for (i = 0; i < 14; i++) {
                System.out.print("Попытка сохранения: " +
                        (char) ('A' + i));
                stk1.push((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException1 exc) {
            System.out.println(exc);
        }

        Stack stk3 = new Stack(stk1);

        try {
            System.out.print("Содержимое стека stk1: ");
            for (i = 0; i < 11; i++) {
                ch = stk1.pop();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException1 exc) {
            System.out.println(exc);
        }

        System.out.println("\n");

        try {
            System.out.print("Содержимое stk2: ");
            for (i = 0; i < 4; i++) {
                ch = stk2.pop();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException1 exc) {
            System.out.println(exc);
        }

            System.out.println("\n");

        try {
            System.out.print("Содержимое stk3: ");
            for (i = 0; i < 13; i++) {
                ch = stk3.pop();
                System.out.print(ch);
            }
        }
        catch (QueueEmptyException1 exc) {
            System.out.println(exc);
        }
    }
}