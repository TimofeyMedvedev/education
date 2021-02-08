package com.company.javarush.uroven1_7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;

        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int m = Integer.parseInt(reader.readLine());
                if (m > max) max = m;
            }
            System.out.println(max);
        }
        else;
    }
}
