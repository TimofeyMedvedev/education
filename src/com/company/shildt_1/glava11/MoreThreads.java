package com.company.glava11;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread3 mt = new MyThread3("Child #1");
        MyThread3 mt1 = new MyThread3("Child #2");
        MyThread3 mt2 = new MyThread3("Child #3");

            do {
                System.out.print(".");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException exc) {
                    System.out.println("Прерывание основного потока");
                }
            } while (mt.thrd.isAlive() ||
                    mt1.thrd.isAlive() || mt2.thrd.isAlive());

        System.out.println("Завершение основного потока");
    }
}
