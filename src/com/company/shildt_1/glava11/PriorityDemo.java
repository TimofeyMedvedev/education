package com.company.glava11;

class Priority implements Runnable {
    int count;
    Thread th;

    static boolean stop = false;
    static String currentName;

    Priority(String name) {
        th = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run() {
        System.out.println(th.getName() + " - запуск");
        do {
            count++;
            if (currentName.compareTo(th.getName()) != 0) {
                currentName = th.getName();
                System.out.println("В " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;
        System.out.println("\n" + th.getName() + " - завершение");
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        Priority p1 = new Priority("High Priority");
        Priority p2 = new Priority("Low Priority");

        p1.th.setPriority(Thread.NORM_PRIORITY + 2);
        p2.th.setPriority(Thread.NORM_PRIORITY - 2);

        p1.th.start();
        p2.th.start();

        try {
            p1.th.join();
            p2.th.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
        System.out.println("\nСчетчик потока High Priority: " + p1.count);
        System.out.println("\nСчетчик потока Low Priority: " + p2.count);
    }
}
