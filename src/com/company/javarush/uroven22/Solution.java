package com.company.javarush.uroven22;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        Queue<String> path = new PriorityQueue<>();
        path.add(root);
        List<String> file = new ArrayList<>();

        while (path.size() > 0) {
            File directory = new File(path.poll());
            for (File f : directory.listFiles()) {
                if (f.isFile())
                    file.add(f.getAbsolutePath());
                else if (f.isDirectory())
                    path.offer(f.getAbsolutePath());
            }
        }
        return file;
    }

        public static void main (String[]args) throws IOException {
        List<String> list = getFileTree("F:\\JavaRush\\excesize\\directory");
        list.forEach(System.out::println);
    }
}