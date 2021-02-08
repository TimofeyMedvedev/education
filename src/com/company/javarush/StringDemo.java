package com.company.javarush;
import javafx.beans.binding.StringBinding;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("..9876543210");
        System.out.println(sb.reverse());
        String s4 = "+38(458)980-74-26";
        System.out.println(s4.replaceAll("\\D", ""));
        String str = "dsfh sdfjh1 sdf2 2 - 2rd";
        System.out.println(str.replaceAll("\\b2\\b", "два"));
//        String s = "ZBC";
//        System.out.println(s.compareTo("ABC"));
//        System.out.println(s.compareToIgnoreCase("zbC"));
//        char[] ch = s.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        System.out.println(s.charAt(0) + " " + s.charAt(1) + " " + s.charAt(2));
//        String c = Character.toString(ch[1]);
//        System.out.println(c);
//        System.out.println(ch[0]);
//        String str = "www.jornalved.com";
//        System.out.println(str);
//        byte[] byt = str.getBytes();
//        System.out.println(Arrays.toString(byt));
//        String str1 = new String(byt);
//        System.out.println("str == str1 ? " + (str == str1));
//        System.out.println("str.equals(str1) ? " + (str.equals(str1)));
//        String emj = "128123";
//        System.out.println(emj.codePoints().count());
//        System.out.println(emj.chars().count());
//        String strr = "Ddf fgfd qwert fbvd rtyy";
//        String s5 = strr.replaceAll(" ", "");
//        System.out.println(strr + "\n" + s5);
    }
}
