package com.company.glava11;

class MyThread3 implements Runnable {
    Thread thrd;

    MyThread3(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}

public class UseThreads2 {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread3 mt = new MyThread3("Child #1");
        MyThread3 mt1 = new MyThread3("Child #2");
        MyThread3 mt2 = new MyThread3("Child #3");

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
