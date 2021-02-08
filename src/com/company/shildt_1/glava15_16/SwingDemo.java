package com.company.glava15_16;
import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");
        // Установать начальные размеры фрейма
        jfrm.setSize(600, 300);
        // Завершить работу программы, когда пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Создать текстовую метку
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");
        // Добавить текстовую метку в панель содержимого
        jfrm.add(jlab);
        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
