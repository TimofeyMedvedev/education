package com.company.javarush.uroven13;
import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str = r.readLine();
        int i = 0;

        FileInputStream fis = new FileInputStream(str);
        do {
            i = fis.read();
            if(i != -1)
                System.out.print((char) i);
        } while (i != -1);
        fis.close();
        r.close();
    }
}
