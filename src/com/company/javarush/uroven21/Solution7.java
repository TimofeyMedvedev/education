package com.company.javarush.uroven21;

/*
Запретить клонирование
*/

public class Solution7 {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public A clone() throws CloneNotSupportedException {
            A a = new A(i, j);
            return a;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public B clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public C clone() throws CloneNotSupportedException {
            C c = new C(super.getI(), super.getJ(), super.getName());
            return c;
        }
    }

    public static void main(String[] args) {
        A a = new A(12, 32);
        A a1 = null;
        B b = new B(10, 3, "class_B");
        B b1 = null;
        C c = new C(2, 4, "class_C");
        C c1 = null;

        try {
            a1 = a.clone();
            c1 = c.clone();
            b1 = b.clone();
        } catch (CloneNotSupportedException exc) {
            System.out.println("Исключение");
        }
        System.out.println(a);
        System.out.println(a1);

        System.out.println(b);
        System.out.println(b1);

        System.out.println(c);
        System.out.println(c1);
    }
}