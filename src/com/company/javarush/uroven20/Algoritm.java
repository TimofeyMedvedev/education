package com.company.javarush.uroven20;

import java.io.IOException;
import java.util.*;

/*
Алгоритмы-числа
*/
public class Algoritm {
    public static long[][] pow = new long[10][20];

    static {
        for(int i = 0; i < 10; i++)
            for(int j = 0; j < 20; j++) {
                if(j == 0) pow[i][j] = i;
                else if(j == 1) pow[i][j] = i;
                else pow[i][j] = pow[i][j-1] * pow[i][0];
            }
    }

    public static long[] getNumbers(long N) {
        List<Long> list = new ArrayList<>();
        int degree;
        long sumSquare = 0;
        String str;

//        for(long i = 1; i < N; i++) {
//            sumSquare = 0;
//            //degree = getLength(i);
//            str = Long.toString(i);
//            for(int j = 0; j < str.length(); j++) {
//                sumSquare += pow[str.charAt(j) - '0'][str.length()];
//            }
//            if(i == sumSquare) list.add(i);
//        }

        for(long i = 1l; i < N; i++) {
            long num = i;
            degree = getLength(i);

            for(; ;) {
                int ost = (int) num % 10;
                sumSquare += pow[ost][degree];
                num /= 10;
                if(num < 10) {
                    sumSquare += pow[(int) num][degree];
                    break;
                }
            }
            if(i == sumSquare) list.add(i);
            sumSquare = 0;
        }

        long[] result = new long[list.size()];
        int j = 0;
        for(Long a : list) {
            result[j] = a;
            j++;
        }
        return result;
    }

    public static int getLength(long number) {
        int length = 1;
        if(number >= 10_000_000_000_000_000l) { length += 16; number /= 10_000_000_000_000_000l; }
        if(number >= 100_000_000) { length += 8; number /= 100_000_000; }
        if(number >= 10000) { length += 4; number /= 10000; }
        if(number >= 100) { length += 2; number /= 100; }
        if(number >= 10) { length += 1; number /= 10; }
        return length;
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1000)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);

        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(1_000_000_000)));
        b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
}