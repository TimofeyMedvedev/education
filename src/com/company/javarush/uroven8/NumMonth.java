package com.company.javarush.uroven8;
import java.io.*;
import java.util.*;

public class NumMonth {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);

        String month = r.readLine();

        for (Map.Entry<String, Integer> pair : map.entrySet())
            if (month.equalsIgnoreCase(pair.getKey())) {
                System.out.println(pair.getKey() + " is the " + pair.getValue() + " month");
                break;
            }
    }
}
