package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        int count = 0;
        if(!args[0].isEmpty()) {
            try (FileInputStream fis = new FileInputStream(args[0])) {
                while (fis.available() > 0) {
                    int b = fis.read();
                    if(b >= 65 && b <= 90 || b >= 97 && b <= 122)
                        count++;
                }
            } catch (IOException e) {}
        }
        System.out.println(count);
    }
}
