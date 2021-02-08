package com.company.javarush.uroven19.excesize;

import java.io.*;
import java.util.ArrayList;

public class LongWords {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");
                for(int i = 0; i < str.length; i++)
                    if(str[i].length() > 6)
                        list.add(str[i]);
            }
        } catch (IOException exc) {}

        try (FileWriter fw = new FileWriter(args[1])) {
            for(int i = 0; i < list.size(); i++) {
                fw.write(list.get(i));
                if(i != list.size() - 1)
                    fw.write(",");
            }
        } catch (IOException exc) {}
    }
}
