package com.company.javarush.uroven1_7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
            strings.add(r.readLine());

        for (int i = 0; i < 13; i++) {
            strings.remove(strings.size()-1);
            strings.add(0, strings.get(strings.size()-1));
        }

        for (int i = 0; i < strings.size(); i++)
            System.out.println(strings.get(i));
    }
}
