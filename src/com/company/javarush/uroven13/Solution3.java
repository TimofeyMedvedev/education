package com.company.javarush.uroven13;
import java.io.*;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        ArrayList<Integer> list = new ArrayList<>();

        while (reader1.ready()) {
            int i = Integer.parseInt(reader1.readLine());
            if(i % 2 == 0)
                list.add(i);
        }
        reader.close();
        reader1.close();
        Collections.sort(list);
        for(Integer n : list)
            System.out.println(n);
    }
}