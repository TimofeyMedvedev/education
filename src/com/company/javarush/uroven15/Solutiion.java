package com.company.javarush.uroven15;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Факториал
*/

public class Solutiion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if(n < 0)
            return "0";
        else if(n == 0)
            return "1";
        BigInteger l = new BigInteger("1");
        for(int i = n; i > 0; i--) {
            l = l.multiply(new BigInteger("" + i));
        }
        return l.toString();
    }
}