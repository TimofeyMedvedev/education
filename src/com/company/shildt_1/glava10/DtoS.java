package com.company.glava10;
import com.sun.source.tree.CompoundAssignmentTree;

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String s;

        try (BufferedReader r = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = r.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывода: " + exc);
        }
    }
}
