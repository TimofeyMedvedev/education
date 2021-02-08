package com.company.javarush.uroven8;
import java.util.*;

public class Ur9 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Cat cat0 = null;
        for(Cat cat : cats) {
            cat0 = cat;
            break;
        }
        cats.remove(cat0);
//        Iterator<Cat> it = cats.iterator();
//        while(it.hasNext()) {
//            it.next();
//            it.remove();
//            break;
//        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat cat : cats)
            System.out.println(cat);
    }

    public static class Cat {
    }
}