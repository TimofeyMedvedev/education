package com.company.glava15_16;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener {

    JList<String> jlist;
    JLabel jlab;
    JScrollPane jsp;

    String names[] = {"Sherry", "Jon", "Rachel", "Sasha",
    "Josselyn", "Randy", "Tom", "Nub", "Mary", "Ken",
    "Andrew", "Matt", "Todd"};

    ListDemo() {
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlist = new JList<String>(names);
        // Задать режим выбора одиночных элементов
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Добавить список в панель с полосами прокрутки
        jsp = new JScrollPane(jlist);
        // Задать предпочтительные размеры прокручиваемой панели
        jsp.setPreferredSize(new Dimension(140, 110));
        // Создать метку для отображения результатов выбора
        jlab = new JLabel("Please choose a name");
        jlist.addListSelectionListener(this);

        jfrm.add(jsp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le) {
        // Получить индекс элемента, состояние выбора которого было изменено
        int idx = jlist.getSelectedIndex();

        // Отобразить результат выбора, если элемент был выбран
        if (idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else jlab.setText("Please choose a name");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });
    }
}
