package com.company.javarush.uroven1_7;

import java.util.ArrayList;

public class Catt {
    public static ArrayList<Catt> cats = new ArrayList<>();

    public Catt() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            cats.add(new Catt());

        printCats();
        }

    public static void printCats() {
        for(int i = 0; i < 10; i++)
        System.out.println(cats.get(i));
    }
}
