package com.company.glava15_16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {
    JTextField jtf;
    JButton jb;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {
        JFrame jfrm = new JFrame("Use a Text Field");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(10);
        // Установить команду действия для текстового поля
        jtf.setActionCommand("myTF");
        jb = new JButton("Reverse");
        jtf.addActionListener(this);
        jb.addActionListener(this);
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jb);
        jfrm.add(jlabContents);
        jfrm.setVisible(true);
    }
    // ОБработать события кнопки
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Reverse")) {
            // Была нажата кнопка Reverse
            String orgStr = jtf.getText();
            String resStr = "";
            for (int i = orgStr.length() - 1; i >= 0; i--)
                resStr += orgStr.charAt(i);
            jtf.setText(resStr);
        } else
            // Клавиша Enter была нажата в тот момент, когда фокус ввода находился в текстовом поле
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TFDemo();
            }
        });
    }
}
