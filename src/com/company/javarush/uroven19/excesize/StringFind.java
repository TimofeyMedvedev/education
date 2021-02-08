package com.company.javarush.uroven19.excesize;

import java.io.*;
import java.util.*;

public class StringFind {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        String file = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        } catch (IOException exc) {}

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                String str = reader.readLine().trim();
                String[] text = str.split(" ");
                int count = 0;
                for(int i = 0; i < text.length; i++) {
                    if(words.contains(text[i])) count++;
                }
                if(count == 2)
                    System.out.println(str);
            }
        } catch (IOException exc) {}
    }
}
