package com.company;

import java.text.DecimalFormat;

public class Solution {
    public static String makeCsvStringFromInts(int[] array) {
        String result = "";
        for(int i : array)
            result += i + ",";
        return result.substring(0, result.length() - 1);
    }

    public static String makeCsvStringFromDoubles(double[] array) {
        String result = "";
        for(double d : array)
            result += new DecimalFormat("#0.00").format(d).replace(',', '.') + ",";
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        double[] in = {1.009,2.342,3.1,4.234,5.1,6.00,7.2,8.234,9.21523};
        System.out.println(makeCsvStringFromDoubles(in));
        int[] n = {1,2,3,4,5,6,7,8,9};
        System.out.println(makeCsvStringFromInts(n));
    }
}
