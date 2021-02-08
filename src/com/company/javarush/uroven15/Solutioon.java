package com.company.javarush.uroven15;

import java.io.*;

public class Solutioon {
    public static void main(String[] args) {
        String str = "";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            str = reader.readLine();
            str = str.substring(str.indexOf('?') + 1, str.length());
        } catch (IOException exc) {
            System.out.print(exc);
        }

        if (str.contains("&")) {
            String[] words = str.split("\\&");
            for (int i = 0; i < words.length; i++) {
                parameter(words[i]);
            }
            System.out.println();
            for(String s : words)
                isObj(s);
        } else {
            parameter(str);
            System.out.println();
            isObj(str);
        }
    }

    public static void isObj(String str) {
        if(str.contains("obj") && str.length() > 3) {
            str = str.substring(4, str.length());
            try {
                alert(Double.parseDouble(str));
            } catch (Exception exc) {
                alert(str);
            }
        }
    }

    public static void parameter(String str) {
        if(str.contains("=")) {
            str = str.substring(0, str.indexOf('='));
            System.out.print(str + " ");
        }
        else System.out.print(str + " ");
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}