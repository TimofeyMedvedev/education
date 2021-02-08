package com.company.javarush.uroven15;

import java.io.*;

public class Solut1 {
    public static int A;
    public static int B;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}