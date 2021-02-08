package com.company.javarush.uroven8;
import java.io.*;
import java.util.*;

/*
Пять победителей
*/

public class Ur12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++)
            list.add(array[i]);
        Collections.sort(list);
        Collections.reverse(list);
        for(int i = 0; i < array.length; i++)
            array[i] = list.get(i);
    }
}