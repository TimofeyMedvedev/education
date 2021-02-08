package com.company.glava11;

class MyThread implements Runnable {
    String thrName;

    MyThread(String name) {
        thrName = name;
    }

    public void run() {
        System.out.println(thrName + " - start");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("В " + thrName + ", счетчик: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrName + " - прерван");
        }
        System.out.println(thrName + " - завершение");
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread mt = new MyThread("Child #1");
        Thread hewThrd = new Thread(mt);

        hewThrd.start();

        for(int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
