package com.company.javarush.uroven19;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberWrite {
    public static void main(String[] args) {
        String fileName_1 = "";
        String fileName_2 = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName_1 = reader.readLine();
            fileName_2 = reader.readLine();
        } catch (IOException exc) {}

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName_1));
             BufferedWriter reader2 = new BufferedWriter(new FileWriter(fileName_2))) {
            while (reader.ready()) {
                String s = reader.readLine();
                Pattern p = Pattern.compile("\\b[0-9]*\\d\\b");
                Matcher m = p.matcher(s);
                while (m.find())
                    reader2.write(s.substring(m.start(), m.end()) + " ");
            }
        } catch (FileNotFoundException exc) {}
          catch (IOException exc) {}
    }
}
