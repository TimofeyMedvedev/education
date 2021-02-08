package com.company.javarush.uroven14;

/*
Исправление ошибок Ӏ Java Core: 4 уровень, 8 лекция
*/

public class Solution7 {
    public static void main(String[] args) {
        Swimmable animal = new Orca();
        animal.swim();
        animal = new Whale();
        animal.swim();
        animal = new Otter();
        animal.swim();
    }

    public static void test(Swimmable animal) {
        animal.swim();
    }

    interface Walkable {
        void walk();
    }

    interface Swimmable {
        void swim();
    }

    static abstract class OceanAnimal implements Swimmable {
        public void swim() {
            OceanAnimal currentAnimal = (OceanAnimal) getCurrentAnimal();
            currentAnimal.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentAnimal().getClass().getSimpleName() + " is swimming");
        }

        abstract Swimmable getCurrentAnimal();
    }

    static class Orca extends OceanAnimal {
        public Swimmable getCurrentAnimal() {
           return new Orca();
        }
    }

    static class Whale extends OceanAnimal {
        public Swimmable getCurrentAnimal() {
            return new Whale();
        }
    }

    static class Otter implements Walkable, Swimmable {
        public void walk() {
        }
        public void swim() {
            System.out.println(this.getClass().getSimpleName() + " is swimming");
        }
    }
}