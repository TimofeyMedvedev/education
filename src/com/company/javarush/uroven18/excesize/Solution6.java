package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution6 {
    public static void main(String[] args) {
        String str = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            str = reader.readLine();
        } catch (IOException exc) {}
        try (BufferedReader reader = new BufferedReader(new FileReader(str))) {
            while (reader.ready()) {
                String str1 = reader.readLine();
                String[] s = str1.split(" ");
                if (s[0].equals(args[0])) {
                    System.out.println(str1);
                    break;
                }
            }
        } catch (IOException exc) {}
    }
}
