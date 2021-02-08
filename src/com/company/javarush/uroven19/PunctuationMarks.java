package com.company.javarush.uroven19;

import java.io.*;

public class PunctuationMarks {
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
                String s = reader.readLine().replaceAll("\\.", "!");
                reader2.write(s + "\r\n");
            }
        } catch (FileNotFoundException exc) {}
        catch (IOException exc) {}
    }
}
