package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s1 = reader.readLine();
            String s2 = reader.readLine();
            String s3 = reader.readLine();
            try (FileReader fr = new FileReader(s2); FileReader fr2 = new FileReader(s3); FileWriter fw = new FileWriter(s1, true);) {
                while (fr.ready()) {
                    fw.write(fr.read());
                }
                while (fr2.ready()) {
                    fw.write(fr2.read());
                }
            } catch (IOException e) {}
        } catch (IOException e) {}
    }
}
