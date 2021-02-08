package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution10 {
    public static void main(String[] args) {
        int key = 4567;
        if(args[0].equals("-e")) {
            try (FileInputStream fr = new FileInputStream(args[1]);
                 FileOutputStream fw = new FileOutputStream(args[2])) {
                while (fr.available() > 0) {
                    byte[] ch = new byte[fr.available()];
                    fr.read(ch);
                    byte[] e = new byte[ch.length];
                    for(int i = 0; i < ch.length; i++) {
                        e[i] = (byte) (ch[i] + 1);
                    }
                    fw.write(e);
                }
            } catch (IOException exc) {}
        }
        else if(args[0].equals("-d")) {
            try (FileInputStream fr = new FileInputStream(args[1]);
                 FileOutputStream fw = new FileOutputStream(args[2])) {
                while (fr.available() > 0) {
                    byte[] ch = new byte[fr.available()];
                    fr.read(ch);
                    byte[] e = new byte[ch.length];
                    for(int i = 0; i < ch.length; i++) {
                        e[i] = (byte) (ch[i] - 1);
                    }
                    fw.write(e);
                }
            } catch (IOException exc) {}
        }
    }
}
