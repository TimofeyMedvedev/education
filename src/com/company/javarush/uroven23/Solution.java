package com.company.javarush.uroven23;

/*
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString(null));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            String[] str = string.split("\\s");
            return new StringBuilder().append(str[1]).append(' ')
                                      .append(str[2]).append(' ')
                                      .append(str[3]).append(' ').append(str[4]).toString();
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exc) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}