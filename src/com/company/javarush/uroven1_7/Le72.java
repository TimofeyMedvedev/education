package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Le72 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n, m;

        n = Integer.parseInt(r.readLine());
        m = Integer.parseInt(r.readLine());

        for(int i = 0; i < n; i++) {
            if (i < m)
                list.add(r.readLine());
            else
                list.add(i - m, r.readLine());
        }

        for(Object x : list)
            System.out.println(x);
    }
}
