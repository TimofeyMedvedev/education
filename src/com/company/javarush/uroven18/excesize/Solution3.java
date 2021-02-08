package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        String s1 = "", s2 = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        s1 = reader.readLine();
        s2 = reader.readLine();

        FileInputStream fr = new FileInputStream(s1);
        byte[] b = new byte[fr.available()];
        while (fr.available() > 0) {
            fr.read(b);
        }
        fr.close();
        FileInputStream fr1 = new FileInputStream(s2);
        FileOutputStream fw = new FileOutputStream(s1);
        while (fr1.available() > 0) {
            fw.write(fr1.read());
        }
        fr1.close();
        fw.write(b);
        fw.close();
    }
}
