package com.company.javarush.uroven18.excesize;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
*/

public class Solution7 {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String fileName = reader.readLine();
                if(fileName.equals("exit"))
                    break;
                else new ReadThread(fileName);
            }
        } catch (IOException exc) {}
        System.out.println();

        for(Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        private HashMap<Integer, Integer> map = new HashMap<>();
        public ReadThread(String fileName) {
            this.fileName = fileName;
            start();
        }
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                while (fis.available() > 0) {
                    int byt = fis.read();
                    int count = 1;
                    if (map.containsKey(byt))
                        map.replace(byt, map.get(byt) + 1);
                    else map.put(byt, count);
                }
            } catch (IOException exc) {}
            int key = 0;
            int val = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if(v > val) {
                    val = v;
                    key = entry.getKey();
                }
            }
            Solution7.resultMap.put(fileName, key);
        }
    }
}