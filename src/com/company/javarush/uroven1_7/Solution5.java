package com.company.javarush.uroven1_7;

import java.io.*;
import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = r.readLine();
            list.add(s);
        }

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).length() >= list.get(i-1).length())
                continue;
            else {
                System.out.println(i);
                break;
            }
        }
    }
}
