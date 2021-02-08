package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Le73 {
    public static void main(String[] args) throws IOException {
        int[] n = new int[20];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int max, min;

        for(int i = 0; i < n.length; i++)
            n[i] = Integer.parseInt(r.readLine());

        max = min = n[0];
        for(int i = 1; i < n.length; i++) {
            if (n[i] > max)
                max = n[i];
            if (n[i] < min)
                min = n[i];
        }

        System.out.println(max + " " + min);
    }
}
