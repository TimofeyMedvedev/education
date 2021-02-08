package com.company.glava1_3;

public class Perebor {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int count = 0;

        System.out.println("Введите символы. Для остановки нажмите \".\"");

        do {
            ch = (char) System.in.read();
            if(ch == ' ') count++;
            System.out.print(ch);
        } while(ch != '.');

        System.out.println("\nПробелы: " + count);
    }
}
