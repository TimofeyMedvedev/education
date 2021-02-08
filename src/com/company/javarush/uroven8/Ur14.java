package com.company.javarush.uroven8;
import java.io.*;
import java.util.Arrays;

/*
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Ur14 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        for(int i = 1; i < array.length; i++)
            for(int j = array.length - 1; j >= i; j--)
                if(isGreaterThan(array[j - 1], array[j])) {
                    String t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
