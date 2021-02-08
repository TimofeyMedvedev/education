package com.company.glava15_16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CBDemo implements ItemListener {
    JLabel jlSel, jlChan;
    JCheckBox jcbA, jcbB, jcbG;

    CBDemo() {
        JFrame jfrm = new JFrame("Use a Text Field");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlSel = new JLabel("");
        jlChan = new JLabel("");

        jcbA = new JCheckBox("Alpha");
        jcbB = new JCheckBox("Beta");
        jcbG = new JCheckBox("Gamma");

        jcbA.addItemListener(this);
        jcbB.addItemListener(this);
        jcbG.addItemListener(this);

        jfrm.add(jcbA);
        jfrm.add(jcbB);
        jfrm.add(jcbG);
        jfrm.add(jlChan);
        jfrm.add(jlSel);

        jfrm.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        String str = "";

        // Получить ссфлку на флажок, с которым связано событие
        JCheckBox cb = (JCheckBox) ie.getItem();
        if(cb.isSelected())
            jlChan.setText(cb.getText() + " was just selected.");
        else
            jlChan.setText(cb.getText() + " was just cleared.");

        if(jcbA.isSelected())
            str += "Alpha ";
        if(jcbB.isSelected())
            str += "Beta ";
        if(jcbG.isSelected())
            str += "Gamma ";

        jlSel.setText("Selected check boxes: " + str);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }
}
