package com.company.javarush.uroven18;

import java.io.*;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(s);
        ArrayList<Integer> list = new ArrayList<>();
        while (fis.available() > 0) {
            int r = fis.read();
            if(list.contains(r))
                continue;
            else list.add(r);
        }
        fis.close();
        Collections.sort(list);
        for(Integer i : list)
            System.out.print(i + " ");
    }
}
