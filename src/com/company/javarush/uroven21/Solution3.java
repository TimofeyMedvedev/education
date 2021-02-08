package com.company.javarush.uroven21;

/*
Все гениальное - просто!
*/

public class Solution3 {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
        return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);
    }

    public static void main(String[] args) {

    }
}
