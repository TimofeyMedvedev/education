package com.company.javarush.uroven1_7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Serty1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n[] = new int[5];

        for(int i = 0; i < 5; i++) {
            int j = Integer.parseInt(reader.readLine());
            n[i] = j;
        }
        Arrays.sort(n);

        for(int i = 0; i < n.length; i++)
            System.out.println(n[i]);
    }
}
