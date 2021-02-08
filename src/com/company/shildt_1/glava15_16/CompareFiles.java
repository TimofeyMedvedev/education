package com.company.glava15_16;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class CompareFiles implements ActionListener {
    JTextField jtf1;
    JTextField jtf2;
    JButton jb;
    JLabel jlab1, jlab2, jlabResult;
    JCheckBox jcb;

    CompareFiles() {
        JFrame jfrm = new JFrame("Compare files");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 190);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf1 = new JTextField(14);
        jtf2 = new JTextField(14);

        // Установить команду действия для текстового поля
        jtf1.setActionCommand("file1");
        jtf2.setActionCommand("file2");

        jb = new JButton("Compare");
        jb.addActionListener(this);

        jlab1 = new JLabel("First file: ");
        jlab2 = new JLabel("Second file: ");
        jlabResult = new JLabel("");
        jcb = new JCheckBox("Show position of mismatch");

        jfrm.add(jlab1);
        jfrm.add(jtf1);
        jfrm.add(jlab2);
        jfrm.add(jtf2);
        jfrm.add(jcb);
        jfrm.add(jb);
        jfrm.add(jlabResult);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int i = 0, j = 0;
        int count = 0;
        // Сначала убедиться в том, что введены имена обоих файлов
        if(jtf1.getText().equals("")) {
            jlabResult.setText("First file name missing.");
            return;
        }
        if(jtf2.getText().equals("")) {
            jlabResult.setText("Second file name missing.");
            return;
        }
        // Сравнить файлы, используя оператор try с ресурсами
        try(FileInputStream f1 = new FileInputStream(jtf1.getText());
            FileInputStream f2 = new FileInputStream(jtf2.getText())) {
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
                count++;
            } while (i != -1 && j != -1);
            if (i != j) {
                if (jcb.isSelected())
                    jlabResult.setText("Files differ at location " + count);
                else
                    jlabResult.setText("Files are not the same.");
            } else
                jlabResult.setText("Files compare equal.");
        } catch (IOException exc) {
            jlabResult.setText("File Error");
        }
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CompareFiles();
            }
        });
    }
}