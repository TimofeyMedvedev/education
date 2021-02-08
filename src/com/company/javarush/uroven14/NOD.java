package com.company.javarush.uroven14;

import java.io.*;

public class NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;

        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            if(a <= 0 || b <= 0)
                throw new Exception();
        } catch (Exception exc) {
                System.out.println(exc);
        }

        // Алгоритм Евклида
        int del;
        while (b != 0) {
            System.out.println(del = a % b);
            a = b;
            b = del;
        }
        System.out.println(a);
    }
}
