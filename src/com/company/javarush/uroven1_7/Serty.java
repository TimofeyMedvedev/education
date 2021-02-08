package com.company.javarush.uroven1_7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Serty {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        int c, b, t;

        for(int i = 0; i < 5; i++) {
            int j = Integer.parseInt(reader.readLine());
            a[i] = j;
        }

        for (c = 1; c < a.length; c++)
            for (b = a.length - 1; b >= c; b--) {
                if (a[b - 1] > a[b]) {
                    t = a[b - 1];
                    a[b - 1] = a[b];
                    a[b] = t;
                }
            }
        for (int i = 0; i < 5; i++)
            System.out.println(a[i]);
    }
}
