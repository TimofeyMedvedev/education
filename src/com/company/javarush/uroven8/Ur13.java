package com.company.javarush.uroven8;
import java.io.*;
import java.util.*;

/*
Модернизация ПО
*/

public class Ur13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> list = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.put(city, family);
        }

        String whatFamily = reader.readLine();

        if (list.containsKey(whatFamily)) {
            System.out.println(list.get(whatFamily));
        }
    }
}