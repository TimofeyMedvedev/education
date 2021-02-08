package com.company.javarush.uroven15;
import java.io.*;
import java.util.*;

/*
Разные методы для разных типов
*/

public class Solution_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String str = reader.readLine();
            if(str.equals("exit"))
                break;
            list.add(str);
        }

        for(String s : list) {
            try {
                if (s.contains("."))
                    print(Double.parseDouble(s));
                else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128)
                    print(Short.parseShort(s));
                else print(Integer.parseInt(s));
            } catch (Exception exc) {
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}