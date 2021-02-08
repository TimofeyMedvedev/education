package com.company.javarush.uroven10;
import java.io.*;
import java.util.*;

public class Ur10_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        try {
            while (true) {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                if (name.isEmpty()) {
                    System.out.println(id);
                    break;
                }
                map.put(name, id);
            }
        } catch (NumberFormatException exc) {}
        finally {
            for(Map.Entry<String, Integer> pair : map.entrySet())
                System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
