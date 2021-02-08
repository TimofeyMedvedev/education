package com.company.javarush.uroven18;

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(s1);
        FileOutputStream fous1 = new FileOutputStream(s2);
        FileOutputStream fous2 = new FileOutputStream(s3);

        if(fis.available() > 0) {
            byte[] buffer = new byte[fis.available()%2 == 0 ? fis.available()/2 : fis.available()/2 + 1];
            fis.read(buffer);
            fous1.write(buffer);
            buffer = new byte[fis.available()];
            fis.read(buffer);
            fous2.write(buffer);
        }
        fis.close();
        fous1.close();
        fous2.close();
    }
}
