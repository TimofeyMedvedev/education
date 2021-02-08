package com.company.javarush.uroven1_7;

public class Le75 {
    public static void main(String[] args) {

        Human ded1 = new Human("Пол", true, 76);
        Human ded2 = new Human("Вася", true, 80);
        Human baba1 = new Human("Наташа", false, 72);
        Human baba2 = new Human("Клава", false, 69);
        Human batya = new Human("Джек", true, 49, ded1, baba1);
        Human mat = new Human("Сюзана", false, 43, ded2, baba2);
        Human son = new Human("Петя", true, 23, batya, mat);
        Human doch1 = new Human("Маша", false, 27, batya, mat);
        Human doch2 = new Human("Глаша", false, 16, batya, mat);

        System.out.print(ded1.toString() + "\n" + ded2.toString() + "\n" +
                baba1.toString() + "\n" + baba2.toString() + "\n" + batya.toString() +
                "\n" + mat.toString() + "\n" + son.toString() + "\n" +
                doch1.toString() + "\n" + doch2.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
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

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
