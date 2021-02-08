package com.company.javarush.uroven18.excesize;

import java.io.*;

public class Solution11 {
    public static void main(String[] args) {
        int id = 0;
        String fileName = "";
        if(args.length != 0) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                fileName = reader.readLine();
                try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName))) {
                    while (reader1.ready()) {
                        int id0 = Integer.parseInt(reader1.readLine().substring(0, 8).trim());
                        if (id0 > id)
                            id = id0;
                    }
                } catch (FileNotFoundException exc) {
                }
            } catch (IOException exc) {
            }
            if(args[1].length() > 30)
                args[1] = args[1].substring(0, 30);
            if(args[2].length() > 8)
                args[2] = args[2].substring(0, 8);
            if(args[3].length() > 4)
                args[3] = args[3].substring(0, 4);

            String s = String.format("%n%-8d%-30s%-8s%-4s", (id + 1), args[1], args[2], args[3]);
            try (FileWriter fw = new FileWriter(fileName, true)) {
                fw.write(s);
            } catch (IOException exc) {}
        }
    }
}
