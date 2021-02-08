package com.company.javarush.uroven1_7;

import java.util.ArrayList;

public class Le76 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        strings.add("лоза");
        strings.add("лора");
        strings.add("поза");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();
        int n = 0;
        for(int i = 0; i < strings.size(); i++) {
            for(int j = 0; j < strings.get(i).length(); j++) {
                if (strings.get(i).charAt(j) == 'р') n -= 1;
                if (strings.get(i).charAt(j) == 'л') n += 1;
            }
            if(n == 0)
                list.add(strings.get(i));
            if(n > 0) {
                list.add(strings.get(i));
                list.add(strings.get(i));
            }
            n = 0;
        }
        return list;
    }
}
