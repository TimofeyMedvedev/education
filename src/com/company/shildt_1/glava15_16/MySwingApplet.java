package com.company.glava15_16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Простой аплет Swing
/*
    <object code="MySwingApplet" width=200 height=80>
    </object>
 */

public class MySwingApplet extends JApplet {
    JButton jbUp;
    JButton jbDown;

    JLabel jlab;
    // Инициализировать аплет
    public void inin() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    makeGUI(); // инициализировать графический интерфейс
                }
            });
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    // Установить и инициализировать графический интерфейс
    private void makeGUI() {
        setLayout(new FlowLayout());

        jbUp = new JButton("Up");
        jbDown = new JButton("Down");

        // Добавить слушатель событий кнопки Up с использованием анонимного
        // внутреннего класса для обработки событий кнопки
        jbUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("You pressed Up.");
            }
        });

        // Добавить слушатель событий кнопки Down
        // с использованием одиночного лямбда-выражения
        jbDown.addActionListener((ae) -> jlab.setText("You pressed Down"));
        add(jbUp);
        add(jbDown);
        jlab = new JLabel("Press a button.");
        add(jlab);
    }
}
