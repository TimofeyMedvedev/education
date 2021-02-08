package com.company.javarush.uroven13;

import java.io.*;

public class BufferWriteDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        try {
            str = reader.readLine();
        } catch (IOException exc) {
            System.out.println(exc);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(str));

        try {
            do {
                str = reader.readLine();
                bw.write(str + "\r\n");
            } while (!str.equals("exit"));
        } catch (IOException exc) {
            System.out.println(exc);
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException exc) {
                System.out.println(exc);
            }
            try {
                if (bw != null) bw.close();
            } catch (IOException exc) {
                System.out.println(exc);
            }
        }
    }
}
