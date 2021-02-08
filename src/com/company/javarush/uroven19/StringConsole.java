package com.company.javarush.uroven19;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringConsole {
    public static void main(String[] args) {
        String fileName = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException exc) {}

        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String s = reader.readLine();
                Pattern p = Pattern.compile("\\bworld\\b");
                Matcher m = p.matcher(s);
                while (m.find())
                    count++;
            }
        } catch (IOException exc) {}
        System.out.println(count);
    }
}
