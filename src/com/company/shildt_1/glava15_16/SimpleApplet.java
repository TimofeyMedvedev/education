package com.company.glava15_16;
import java.awt.*;
import java.applet.*;
/*
    <applet code="SimpleApplet" width=200 height=60>
    </applet>
 */

public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy.", 20, 20);
    }
}
