package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Soluyion8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String str = reader.readLine();
                try (FileReader fr = new FileReader(str)) {
                } catch (FileNotFoundException exc) {
                    System.out.println(str);
                    break;
                }
            }
        } catch (IOException exc) {}
    }
}
