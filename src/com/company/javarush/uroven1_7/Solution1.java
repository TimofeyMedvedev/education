package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution1 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = 0;
        int b = 0;

        for(int i = 0; i < s.length(); i++) {
            int r = Integer.parseInt(s.substring(i, i+1));
            if(r % 2 == 0) a++;
            else b++;
        }
        even = a;
        odd = b;
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
