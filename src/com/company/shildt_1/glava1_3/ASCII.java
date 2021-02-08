package com.company.glava1_3;

public class ASCII {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        int count = 0;

        System.out.println("Введите символы. Для остановки введите \".\"");

        do {
            ch = (char) System.in.read();
            if(ch >= 'A' & ch <= 'Z') {
                ch += 32;
                count++;
                System.out.print(ch);
            }
            else if(ch >= 'a' & ch <= 'z') {
                ch -= 32;
                count++;
                System.out.print(ch);
            }
            else System.out.print(ch);
        } while(ch != '.');
        System.out.println("\nКолличество символов для которых был изменен регистр: " + count);
    }
}
