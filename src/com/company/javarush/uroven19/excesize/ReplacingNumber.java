package com.company.javarush.uroven19.excesize;

import java.io.*;
import java.util.*;

/*
Замена чисел
*/

public class ReplacingNumber {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        String[] words = {"ноль", "один", "два", "три", "четыре", "пять",
                "шесть", "семь", "восемь", "девять", "десять", "одиннадцать", "двенадцать",};
        for(int i = 0; i < 13; i++)
            map.put(i, words[i]);
    }

    public static void main(String[] args) {
        String file = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        } catch (IOException exc) {}

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String str = reader.readLine();
                String result = new String();
                result = replaceNumber(str, 12);
                System.out.println(result);
            }
        } catch (IOException exc) {}
    }

    public static String replaceNumber(String str, int n) {
        if(n < 0)
            return str;
        else
            return replaceNumber(str.replaceAll("\\b"+n+"\\b", map.get(n)), n - 1);
    }
}