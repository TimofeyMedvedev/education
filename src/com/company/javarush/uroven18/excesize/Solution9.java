package com.company.javarush.uroven18.excesize;

import java.io.*;
import java.util.*;

public class Solution9 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        String newFile = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = reader.readLine();
                if(fileName.equals("end"))
                    break;
                int part = Integer.parseInt(fileName.substring(fileName.lastIndexOf(".part") + 5, fileName.length()));
                newFile = fileName.substring(fileName.lastIndexOf('\\') + 1, fileName.lastIndexOf(".part"));
                newFile = fileName.substring(0, fileName.lastIndexOf('\\') + 1) + newFile;
                map.put(part, fileName);
            }
        } catch (IOException exc) {}
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile, true), 1000)) {
            for(Map.Entry<Integer, String> entry : map.entrySet()) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(entry.getValue()), 1000)) {
                    while (bis.available() > 0)
                    bos.write(bis.read());
                } catch (FileNotFoundException exc) {}
            }
        } catch (IOException exc) {}
    }
}