package com.company.javarush.uroven18;

import java.io.*;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(s);
        HashMap<Integer, Integer> map = new HashMap<>();
        while (fis.available() > 0) {
            int r = fis.read();
            int count = 1;
            if (map.containsKey(r))
                map.replace(r, map.get(r) + 1);
            else map.put(r, count);
        }
        fis.close();
        ArrayList<Integer> arKey = new ArrayList<>();
        ArrayList<Integer> arVal = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arKey.add(entry.getKey());
            arVal.add(entry.getValue());
        }
        map = null;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(Integer i : arVal) {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
        }
        int t = 0;
        for(Integer i : arVal) {
            if (i == max)
                System.out.print(arKey.get(t) + " ");
            t++;
        }
        System.out.println();
        t = 0;
        for(Integer i : arVal) {
            if (i == min)
                System.out.print(arKey.get(t) + " ");
            t++;
        }
    }
}