package com.company.glava10.zadanie;
import java.io.*;

public class Zad {
    public static void main(String[] args) {
        int i=0, j=0, k=0;

        try (FileInputStream f1 = new FileInputStream("TEST.txt");
             FileInputStream f2 = new FileInputStream("FEST.txt")) {
            do {
                i = f1.read();
                j = f2.read();
                k++;
                Character f, v;
                f = Character.toUpperCase((char) i);
                v = Character.toUpperCase((char) j);
                if (!f.equals(v)) break;
            } while (i != -1 && j != -1);
            if (i != j)
                System.out.println("Содержимое файлов отличается, начиная с " + k + " позиции");
            else
                System.out.println("Содержимое файлов совпадает");
        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывода: " + exc);
        }
    }
}