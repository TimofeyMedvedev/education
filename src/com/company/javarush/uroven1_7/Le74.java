package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Le74 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String s = r.readLine();
            if(s.equals("end"))
                break;
            list.add(s);
        }

        for(Object x : list)
            System.out.println(x);
    }
}
