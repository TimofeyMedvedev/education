package com.company.glava11;

public class JoinTHreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread3 mt = new MyThread3("Child #1");
        MyThread3 mt1 = new MyThread3("Child #2");
        MyThread3 mt2 = new MyThread3("Child #3");

        try {
            mt.thrd.join();
            System.out.println("Child #1 - connected");
            mt1.thrd.join();
            System.out.println("Child #2 - connected");
            mt2.thrd.join();
            System.out.println("Child #3 - connected");
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Завершение основного потока");
    }
}
