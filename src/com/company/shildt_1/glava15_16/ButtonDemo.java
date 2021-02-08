package com.company.glava15_16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
    JLabel jlab;
    ButtonDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("A Button Example");
        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());
        // Установать начальные размеры фрейма
        jfrm.setSize(220, 90);
        // Завершить работу программы, когда пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создать две кнопки
        JButton jbUp = new JButton("Up");
        JButton jbDown = new JButton("Down");
        // Добавить слушатели действий
        jbUp.addActionListener(this);
        jbDown.addActionListener(this);
        // Добавить кнопки в панель содержимого
        jfrm.add(jbUp);
        jfrm.add(jbDown);
        // Создать метку
        jlab = new JLabel("Press a button.");
        // Добавить метку во фрейм
        jfrm.add(jlab);
        // Отобразить фрейм
        jfrm.setVisible(true);
    }
    // ОБработать события кнопки
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Up"))
            jlab.setText("You pressed Up.");
        else jlab.setText("You pressed Down");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}