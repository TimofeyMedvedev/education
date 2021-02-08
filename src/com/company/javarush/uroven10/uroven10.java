package com.company.javarush.uroven10;

public class uroven10 {
    public static void main(String[] args) {
//        int a = 15;
//        int b = 4;
//        float c = (float) a / b;
//        double d = a * 1e-3 + c;
//        System.out.println(c);
//        System.out.println(d);
//        float f = (float) 128.50;
//        System.out.println(f);
//        int i = (byte) f;
//        System.out.println(i);
//        int b1 = (int) (i + f);
//        System.out.println(b1);
//
//        short s = 9;
//        char z = '0';
//        int j = z;
//        System.out.println(j);
//        int n = (z + s);
//        System.out.println((char) n);
//
//        int a1 = 44;
//        int b2 = 300;
//        short c1 = (short) (b2 - a1);
//        System.out.println(c1);

        double d1 = (short) 2.50256e2d;
        char c2 = 'd';
        short s2 = (short) 2.22;
        int i2 = 150000;
        float f2 = 0.50f;
        double result = f2 + (i2 / c2) - (d1 * s2) - 500e-3;
        System.out.println("result: " + result);

        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(x+"  "+"  "+m+"  "+f+"  "+l);
    }
}
