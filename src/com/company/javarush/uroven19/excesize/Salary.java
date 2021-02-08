package com.company.javarush.uroven19.excesize;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Salary {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String[] str = br.readLine().trim().split(" ");
                double d = Double.parseDouble(str[1]);
                if(map.containsKey(str[0])) {
                    map.replace(str[0], map.get(str[0]) + d);
                }
                else map.put(str[0], d);
            }
        } catch (FileNotFoundException exc) {}
        catch (IOException exc) {}
        for(Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
