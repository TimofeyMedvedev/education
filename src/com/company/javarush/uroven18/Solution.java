package com.company.javarush.uroven18;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(s);
        int max = 0;
        int min = Integer.MAX_VALUE;
        while (fis.available() > 0) {
            int r = fis.read();
            if(r > max)
                max = r;
            if(r < min)
                min = r;
        }
        fis.close();
        System.out.println(max + " " + min);
    }
}
