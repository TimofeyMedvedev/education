package com.company.javarush.uroven10;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();
        private Human father;
        private Human mother;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, int age, boolean sex, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age, Human...child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(child));
        }

        public Human(String name, int age, boolean sex, Human...child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(child));
        }
    }
}
