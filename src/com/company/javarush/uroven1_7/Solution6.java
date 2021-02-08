package com.company.javarush.uroven1_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution6 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> t = new ArrayList<>();
        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++)
            t.add(Integer.parseInt(r.readLine()));

        for(int i = 0; i < t.size(); i++) {
            if(t.get(i) % 3 == 0) t1.add(t.get(i));
            if(t.get(i) % 2 == 0) t2.add(t.get(i));
            if(t.get(i) % 2 != 0 & t.get(i) % 3 != 0) t3.add(t.get(i));
        }

        printList(t1);
        printList(t2);
        printList(t3);
     }

     public static void printList(ArrayList<Integer> list) {
        for(Object i : list)
            System.out.println(i);
     }
}
