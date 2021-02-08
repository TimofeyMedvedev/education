package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution1 {
    public static void main(String[] args) {
        int count = 0;
        int fount = 0;
        if (!args[0].isEmpty()) {
            try (FileInputStream fis = new FileInputStream(args[0])) {
                while (fis.available() > 0) {
                    int t = fis.read();
                    if(t == 32) {
                        count++;
                        fount++;
                    }
                    else fount++;
                }
            } catch (IOException e) {
            }
        }
        System.out.printf("%.2f", ((double) count/fount * 100));
    }
}