package com.company.javarush.uroven9;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int i = Integer.parseInt(r.readLine());
                list.add(i);
            }
        } catch (IOException exc) {
        } finally {
            for (Integer i : list)
                System.out.println(i);
        }
    }
}
