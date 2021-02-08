package com.company.glava12;

enum TrafficLC {
    RED, GREEN, YELLOW
}

class TrafficLS implements Runnable {
    private Thread th;
    private TrafficLC tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLS(TrafficLC init) {
        tlc = init;
        th = new Thread(this);
        th.start();
    }

    TrafficLS() {
        tlc = TrafficLC.RED;
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN:
                        Thread.sleep(10000);
                        break;
                    case YELLOW:
                        Thread.sleep(2000);
                        break;
                    case RED:
                        Thread.sleep(12000);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLC.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLC.RED;
                break;
            case GREEN:
                tlc = TrafficLC.YELLOW;
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

    TrafficLC getColor() {
        return tlc;
    }

    void cancel() {
        stop = true;
    }
}

public class TrafficLD {
    public static void main(String[] args) {
        TrafficLS tl = new TrafficLS(TrafficLC.GREEN);

        for(int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
