package com.company.glava11;

class MyThread2 extends Thread {

    MyThread2(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName() + " - start");
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " - завершение");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        MyThread2 mt = new MyThread2("Child #1");

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
