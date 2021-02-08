package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SredneArifmeth {
    public static void main(String[] args) throws Exception {
        double sum = 0, count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1)
                break;
            count++;
            sum += n;
        }
        System.out.println("Среднее арифмитическое: " + sum / count);
    }
}
