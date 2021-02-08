package com.company.javarush.uroven10;
import java.util.*;

public class Ur10_1 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[10];
        for( int i = 0; i < list.length; i++) {
            ArrayList<String> l = new ArrayList<>();
            l.add("i " + i);
            l.add("i " + i + 1);
            l.add("i " + i + 2);
            list[i] = l;
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
