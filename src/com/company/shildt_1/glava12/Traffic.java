package com.company.glava12;

enum TrafficL {
    RED(6_000), GREEN(5_000), YELLOW(2_000);
    private int delay;

    TrafficL(int d) {
        delay = d;
    }

    int getDelay() {
        return delay;
    }
}

class TrafficS implements Runnable {
    private Thread th;
    private TrafficL tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficS(TrafficL init) {
        tlc = init;
        th = new Thread(this);
        th.start();
    }

    TrafficS() {
        tlc = TrafficL.RED;
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficL.GREEN;
                break;
            case YELLOW:
                tlc = TrafficL.RED;
                break;
            case GREEN:
                tlc = TrafficL.YELLOW;
                break;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed)
                wait();
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    TrafficL getColor() {
        return tlc;
    }

    void cancel() {
        stop = true;
    }
}

public class Traffic {
    public static void main(String[] args) {
        TrafficS tl = new TrafficS(TrafficL.GREEN);

        for(int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
