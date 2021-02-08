package com.company.javarush.uroven19.excesize;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsWithNumber {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             FileWriter fr = new FileWriter(args[1])) {
            while (reader.ready()) {
                String[] str = reader.readLine().trim().split(" ");
                Pattern p = Pattern.compile("\\d");
                for(int i = 0; i < str.length; i++) {
                    Matcher m = p.matcher(str[i]);
                    if(m.find()) {
                        fr.write(str[i] + " ");
                    }
                }
            }
        } catch (IOException exc) {}
    }
}
