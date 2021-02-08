package com.company.javarush.uroven16.excesize;
/*
Рекурсивное создание нитей
*/

public class Recrus {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super("" + (++createdThreadCount));
            start();
        }

        public void run() {
            if(createdThreadCount <= count)
                System.out.println(new GenerateThread());
        }

        @Override
        public String toString() {
            return String.format("%s created", getName());
        }
    }
}