package com.company.javarush.uroven1_7;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Summa {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while(true) {
            String s = reader.readLine();
            if (s.trim().equals("сумма"))
                break;
            sum += Integer.parseInt(s.trim());
        }
        System.out.println(sum);
    }
}
