package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a < 0)
            a = -a;
        if (a == 0) even++;
        for (int i = 0; a > 0; i++) {
                if (a % 2 == 0)
                    even++;
                else odd++;
                a /= 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
