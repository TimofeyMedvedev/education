package com.company.glava11;

class MThread implements Runnable {
    Thread th;

    volatile boolean suspended;
    volatile boolean stopped;

    MThread(String name) {
        th = new Thread(this, name);
        suspended = false;
        stopped = false;
        th.start();
    }

    public void run() {
        System.out.println(th.getName() + " - запуск");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
                if(stopped) break;
            }
        } catch (InterruptedException exc) {
            System.out.println(th.getName() + " - прерван");
        }
        System.out.println(th.getName() + " - выход");
    }

    synchronized void mystop() {
        stopped = true;
        suspended = false;
        notify();
    }

    synchronized void mysuspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}

public class Suspend {
    public static void main(String[] args) {
        MThread ob = new MThread("My Thread");

        try {
            Thread.sleep(1000);

            ob.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob.mysuspend();
            System.out.println("Остановка потока");
            ob.mystop();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        try {
            ob.th.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Выход из основного потока");
    }
}
