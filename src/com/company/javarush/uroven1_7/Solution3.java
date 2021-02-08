package com.company.javarush.uroven1_7;

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[15];
        int right = 0, left = 0;

        for(int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(r.readLine());
            if (i == 0 | i % 2 == 0)
                right += n[i];
            else left += n[i];
        }
        if(right > left)
            System.out.println("В домах с четными номерами проживает больше жителей");
        else if(right < left)
            System.out.println("В домах с нечетными номерами проживает больше жителей");
    }
}
