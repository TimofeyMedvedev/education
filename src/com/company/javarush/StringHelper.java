package com.company.javarush;
import java.util.Set;
import java.util.HashSet;

public class StringHelper {
    public static Set<String> permFin(String str) {
        Set<String> perm = new HashSet<>();

        if(str == null)
            return null;
        else if(str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permFin(rem);
        for(String strNew : words) {
            for(int i = 0; i <= strNew.length(); i++)
                perm.add(charInsert(strNew, initial, i));
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
        String s = "ABC";
        String s1 = "AAC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permFin(s));
        System.out.println("\nPermutations for " + s1 + " are: \n" + permFin(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + permFin(s2));
    }
}
