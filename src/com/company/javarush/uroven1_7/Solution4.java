package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = r.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);

        for (Object i : result)
            System.out.println(i);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
            list2.add(list.get(i));
        }
        return list2;
    }
}
