package com.company.javarush.uroven15;

import java.util.*;

public class Solut {
    public static Map<Double, String> labels = new HashMap<>();
    static {
        for(int i = 0; i < 5; i++)
            labels.put(0.12 + i, "0" + i);
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
