package com.company.glava15_16;
import java.applet.*;
import java.awt.*;
/*
    <applet code="Banner" width=300 heigth=50>
    </applet>
 */

public class Banner extends Applet implements Runnable {
    String msg = " Java rules the Web ";
    Thread t;
    boolean stopFlag;

    public void init() {
        t = null;
    }

    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    public void run() {
        for( ; ; ) {
            try {
                repaint();
                Thread.sleep(250);
                if(stopFlag)
                    break;
            } catch (InterruptedException exc) {}
        }
    }

    public void stop() {
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;
        g.drawString(msg, 50, 30);
    }
}
