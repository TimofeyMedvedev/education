package com.company.javarush.uroven18;

import java.io.*;

public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(s1);
        FileOutputStream fous = new FileOutputStream(s2);
        if(fis.available() > 0) {
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            for(int i = buffer.length - 1; i >= 0; i--)
                fous.write(buffer[i]);
        }
        fis.close();
        fous.close();
    }
}
