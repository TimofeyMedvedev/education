package com.company.glava5;

public class UpCase {
    public static void main(String[] args) {
        char ch;

        for(int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char) ((int) ch & 65503);
            // 65503 является десятичным представлением двоичного
            //числа 1111 1111 1101 1111
            System.out.print(ch + " ");
        }
    }
}
