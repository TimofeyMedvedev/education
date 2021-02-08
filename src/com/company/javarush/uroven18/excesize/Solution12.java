package com.company.javarush.uroven18.excesize;

import java.io.*;
import java.util.ArrayList;

public class Solution12 {
    public static void main(String[] args) {
        if (args.length != 0) {
            int id = Integer.parseInt(args[1]);
            String did = args[0];
            String fileName = "";
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                fileName = reader.readLine();
            } catch (IOException exc) {}
            if(did.equals("-d"))
                readerFile(fileName, id);
            else if(did.equals("-u")) {
                String s = String.format("%-8d%-30s%-8s%-4s", id, args[2], args[3], args[4]);
                readerFile(fileName, id, s);
            }
        }
    }

    public static void readerFile(String name, int id) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            while (reader.ready()) {
                String str = reader.readLine();
                String se = str.substring(0, 15).replaceAll("[^0-9]", "");
                if(Integer.parseInt(se) != id)
                    list.add(str);
            }
        } catch (IOException exc) {}
        try (FileWriter fw = new FileWriter(name)) {
            for(int i = 0; i < list.size(); i++)
                fw.write(list.get(i) + "\r\n");
        } catch (IOException exc) {}
    }

    public static void readerFile(String name, int id, String s) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            while (reader.ready()) {
                String str = reader.readLine();
                String se = str.substring(0, 15).replaceAll("[^0-9]", "");
                if(Integer.parseInt(se) != id)
                    list.add(str);
                else list.add(s);
            }
        } catch (IOException exc) {}
        try (FileWriter fw = new FileWriter(name)) {
            for(int i = 0; i < list.size(); i++)
                fw.write(list.get(i) + "\r\n");
        } catch (IOException exc) {}
    }
}
