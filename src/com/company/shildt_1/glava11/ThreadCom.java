package com.company.glava11;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");
        state = "ticked";

        notify();
        try {
            while (!state.equals("tocked"))
                wait();;
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";

        notify();
        try {
            while (!state.equals("ticked"))
                wait();;
        } catch (InterruptedException exc) {
            System.out.println("Прерывание потока");
        }
    }
}

class MyThred implements Runnable {
    Thread th;
    TickTock ttob;

    MyThred(String name, TickTock tt) {
        th = new Thread(this, name);
        ttob = tt;
        th.start();
    }

    public void run() {
        if(th.getName().compareTo("Tick") == 0) {
            for(int i = 0; i < 5; i++) ttob.tick(true);
            ttob.tick(false);
        }
        else {
            for(int i = 0; i < 5; i++) ttob.tock(true);
            ttob.tock(false);
        }
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThred m1 = new MyThred("Tick", tt);
        MyThred m2 = new MyThred("Tock", tt);

        try {
            m1.th.join();
            m2.th.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
