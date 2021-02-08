package com.company.javarush.uroven16;

/*
Отсчет на гонках
*/

public class Gonki {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (numSeconds > 0) {
                try {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                    if(numSeconds == 0) {
                        System.out.print("Марш!");
                        break;
                    }
                } catch (InterruptedException exc) {
                    System.out.print("Прервано!");
                    break;
                }
            }
        }
    }
}