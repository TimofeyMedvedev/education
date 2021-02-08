package com.company.javarush.uroven18.excesize;

import java.io.*;
import java.util.*;

public class Solution5 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        try (FileInputStream fis = new FileInputStream(args[0])) {
            while (fis.available() > 0) {
                char ch = (char) fis.read();
                int count = 1;
                if(map.containsKey(ch)) {
                    map.replace(ch, map.get(ch) + 1);
                }
                else map.put(ch, count);
            }
        } catch (FileNotFoundException exc) {}
        catch (IOException exc) {}
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
