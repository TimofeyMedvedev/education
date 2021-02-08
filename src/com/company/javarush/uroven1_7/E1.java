package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class E1 {
    private static ArrayList<String> strings;
    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;

        for (int i = 0; i < 5; i++)
            strings.add(r.readLine());

        for (int i = 0; i < 5; i++) {
            if (max < strings.get(i).length())
                max = strings.get(i).length();
        }

        for (int i = 0; i < 5; i++) {
            if (max == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}
