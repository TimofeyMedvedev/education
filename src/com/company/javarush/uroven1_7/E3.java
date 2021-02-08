package com.company.javarush.uroven1_7;
import java.io.*;
import java.util.ArrayList;

public class E3 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            strings.add(r.readLine());
            if (max < strings.get(i).length())
                max = strings.get(i).length();
            if (min > strings.get(i).length())
                min = strings.get(i).length();
        }

        for (int i = 0; i < 10; i++) {
            if (max == strings.get(i).length() || min == strings.get(i).length()) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
