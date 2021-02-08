package com.company.glava1_3;

public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch, answer = 'S';
        System.out.println("Задумана буква из диапазона A - Z.");
        System.out.print("Попытайтесь её угадать");

        ch = (char) System.in.read();
         if(ch == answer) System.out.println("** Правильно! **");
    }
}
