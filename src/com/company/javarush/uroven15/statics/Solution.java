package com.company.javarush.uroven15.statics;

import java.io.*;
import java.util.*;

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        String s;
        try (BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME))) {
            while ((s = reader.readLine()) != null)
                lines.add(s);
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
