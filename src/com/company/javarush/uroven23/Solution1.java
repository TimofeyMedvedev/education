package com.company.javarush.uroven23;

/*
Между табуляциями
*/

public class Solution1 {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            return string.substring(string.indexOf("\t") + 1, string.indexOf("\t", string.indexOf("\t") + 1));
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
