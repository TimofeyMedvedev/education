package com.company.javarush.uroven19.excesize;

import java.io.*;

public class ReverseFile {
    public static void main(String[] args) {
        String file = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        } catch (IOException exc) {}

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                StringBuilder sb = new StringBuilder(reader.readLine().trim());
                System.out.println(sb.reverse());
            }
        } catch (IOException exc) {}
    }
}
