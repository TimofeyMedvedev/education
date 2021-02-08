package com.company.javarush.uroven8;
import java.io.*;

public class Ur15 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader((new InputStreamReader(System.in)));
        String str = r.readLine();

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ')
                chars[i] = Character.toUpperCase(chars[i]);
        }
        System.out.println(new String(chars));
    }
}
