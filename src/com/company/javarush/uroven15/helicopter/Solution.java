package com.company.javarush.uroven15.helicopter;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            if(str.equals("helicopter")) {
                result = new Helicopter();
            }
            else if(str.equals("plane")) {
                int n = Integer.parseInt(reader.readLine());
                result = new Plane(n);
            }
            reader.close();
        } catch (IOException exc) {}
    }
}
