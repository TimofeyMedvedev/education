package com.company.javarush.uroven9;

import java.util.ArrayList;
import java.util.HashMap;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int t = 42 / 0;
            System.out.println(t);
        } catch (ArithmeticException exc) {
            System.out.println(exc);
        }
        try {
            String s = null;
            String m = s.toLowerCase();
            System.out.println(m);
        } catch (NullPointerException exc) {
            System.out.println(exc);
        }
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
        try {
            HashMap map = new HashMap(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException exc) {
            System.out.println(exc);
        }
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException exc) {
            System.out.println(exc);
        }
    }
}
