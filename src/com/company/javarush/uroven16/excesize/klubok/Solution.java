package com.company.javarush.uroven16.excesize.klubok;

import java.io.*;
import java.util.*;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread_1());
        threads.add(new Thread_2());
        threads.add(new Thread_3());
        threads.add(new Thread_4());
        threads.add(new Thread_5());
    }

    public static void main(String[] args) {
        threads.get(4).start();
    }

    public static class Thread_1 extends Thread {
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread_2 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }

    public static class Thread_3 extends Thread {
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException exc) { }
        }
    }

    public static class Thread_4 extends Thread implements Message {
        @Override
        public void showWarning() {
            if(isAlive())
                interrupt();
        }

        public void run() {
            while (!isInterrupted()) {

            }
        }
    }

    public static class Thread_5 extends Thread {
        public void run() {
            int n = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    String s = reader.readLine();
                    if(s.equals("N")) {
                        System.out.println(n);
                        break;
                    }
                    n += Integer.parseInt(s);
                }
            } catch (IOException exc) {}
        }
    }
}