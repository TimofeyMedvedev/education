package com.company.javarush.uroven18;
import java.io.*;

public class Solution_zapyataya {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(s);

        int count = 0;
        while (fis.available() > 0) {
            if(fis.read() == ',')
                count++;
        }
        fis.close();
        System.out.println(count);
    }
}
