package com.company.javarush.uroven8;
import java.util.*;

/*
Больше 10? Вы нам не подходите
*/

public class Ur4 {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 20; i++)
            set.add(i);
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            if (it.next() > 10)
                it.remove();
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        for(Integer i : set)
            System.out.println(i);

        Set<Integer> s = removeAllNumbersGreaterThan10(set);
        for(Integer i : s)
            System.out.println(i);
    }
}