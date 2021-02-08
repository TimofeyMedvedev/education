package com.company.javarush.uroven1_7;

import java.io.*;
import java.util.ArrayList;

public class Le71 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            if (string.length() % 2 == 0)
            resultStrings.add(strings.get(i) + " " + strings.get(i));
            else  resultStrings.add(strings.get(i) + " " + strings.get(i) + " " + strings.get(i));
        }

        for (int i = 0; i < resultStrings.size(); i++)
            System.out.println(resultStrings.get(i));
    }
}
