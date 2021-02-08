package com.company.glava10.zadanie;

import java.io.*;

public class Zad7 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

//        if(args.length != 2) {
//            System.out.println("Использование: CopyFile откуда куда");
//            return;
//        }

        try {
            fin = new FileInputStream("TEST.txt");
            fout = new FileOutputStream("FEST.txt");

            do {
                i = fin.read();
                if (i != -1) {
                    if(i == 32)  // if((char) i == ' ');
                        i = 45;  // i = '-';
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывода");
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии входного файла");
            }
            try {
                if(fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии выходного файла");
            }
        }
    }
}
