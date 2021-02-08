package com.company.javarush.uroven16.excesize;

/*
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution1 {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countdownIndex == 0) return;
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("Нить прервана");
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}