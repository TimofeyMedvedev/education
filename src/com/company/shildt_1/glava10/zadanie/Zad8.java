package com.company.glava10.zadanie;
import java.io.*;

public class Zad8 {
    public static void main(String[] args) throws IOException {
        int i;

        try (FileReader r = new FileReader("test.txt");
              FileWriter fw = new FileWriter("fest.txt"))
        {
            do {
                i = r.read();
                if (i != -1) {
                    if(i == ' ')
                        i = '-';
                    fw.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывода: " + exc);
        }
    }
}