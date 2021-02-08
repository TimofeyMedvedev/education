package com.company.javarush.uroven8;
import java.io.*;
import java.util.*;

public class Ur3 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        int max = 1;
        int t = 1;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++)
            list.add(Integer.parseInt(r.readLine()));

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i - 1).equals(list.get(i))) {
                t++;
                if (t > max)
                    max = t;
            }
            else t = 1;
            }
        System.out.println(max);
    }
}
