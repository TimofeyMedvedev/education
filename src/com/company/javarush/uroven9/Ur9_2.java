package com.company.javarush.uroven9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ur9_2 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();
        String str1 = "", str2 = "";
        for(int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i)))
                str1 += str.charAt(i);
            else if(str.charAt(i) != ' ')
                str2 += str.charAt(i);
        }
        for(int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i) + " ");
        System.out.println();
        for(int i = 0; i < str2.length(); i++)
            System.out.print(str2.charAt(i) + " ");
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
