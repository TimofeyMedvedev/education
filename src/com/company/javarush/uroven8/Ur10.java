package com.company.javarush.uroven8;
import java.util.*;

/*
Множество всех животных
*/

public class Ur10 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        System.out.println();

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        for(int i = 0; i < 4; i++)
            result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<Dog>();
        for(int i = 0; i < 3; i++)
            result.add(new Dog());

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
//        for(Cat c : cats) {
//            for (Object ob : pets) {
//                if (c.equals(ob))
//                    break;
//            }
//            pets.remove(c);
//        }
        pets.removeAll(cats);
    }


    public static void printPets(Set<Object> pets) {
        for(Object ob : pets)
            System.out.println(ob);
    }

    public static class Cat{}
    public static class Dog{}
}