package com.company.javarush.uroven8;

import java.util.ArrayList;
import java.util.Arrays;

public class Ur11 {
    public static void main(String[] args) {
        Human son = new Human("Петя", true, 23);
        Human doch1 = new Human("Маша", false, 27);
        Human doch2 = new Human("Глаша", false, 16);
        Human batya = new Human("Джек", true, 49, son, doch1, doch2);
        Human mat = new Human("Сюзана", false, 43, son, doch1, doch2);
        Human ded1 = new Human("Пол", true, 76, batya);
        Human ded2 = new Human("Вася", true, 80, mat);
        Human baba1 = new Human("Наташа", false, 72, batya);
        Human baba2 = new Human("Клава", false, 69, mat);



        System.out.print(ded1.toString() + "\n" + ded2.toString() + "\n" +
                baba1.toString() + "\n" + baba2.toString() + "\n" + batya.toString() +
                "\n" + mat.toString() + "\n" + son.toString() + "\n" +
                doch1.toString() + "\n" + doch2.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human...child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(Arrays.asList(child));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}