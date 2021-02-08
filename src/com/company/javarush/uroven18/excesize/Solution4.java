package com.company.javarush.uroven18.excesize;

import java.io.*;
import java.lang.Math;

public class Solution4 {
    public static void main(String[] args) {
        String str = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            try (BufferedReader reader1 = new BufferedReader(new FileReader(s1)); FileWriter fw = new FileWriter(s2)) {
                while (reader1.ready()) {
                    str = reader1.readLine();
                    String[] s = str.split(" ");
                    for(int i = 0; i < s.length; i++) {
                        double d = Double.parseDouble(s[i]);
                        long n = Math.round(d);
                        fw.write("" + n + " ");
                    }
                }
            } catch (FileNotFoundException exc) {}
        } catch (IOException exc) {
        }
    }
}
