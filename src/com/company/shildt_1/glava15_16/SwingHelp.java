package com.company.glava15_16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class SwingHelp implements ListSelectionListener {
    JList<String> jlist;
    JLabel jlab;
    JScrollPane jsp;

    String names[] = {"if", "switch", "for", "while",
            "do-while", "break", "continue"};

    String operator[] = {"<html>if(условие) оператор;<br>else оператор;</html>",
    "<html>switch(выражение) {<br>  case константа:<br>  последовательность операторов<br>  break;<br>  // ...<br>}</html>",
    "for(инициализация; условие; итерация) оператор;", "while(условие) оператор;", "<html>do {<br>  оператор;<br>} while(условие);</html>",
    "break; или break метка;", "continue; или continue метка;"};

    SwingHelp() {
        JFrame jfrm = new JFrame("Help Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(190, 260);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlist = new JList<String>(names);
        // Задать режим выбора одиночных элементов
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Добавить список в панель с полосами прокрутки
        jsp = new JScrollPane(jlist);
        // Задать предпочтительные размеры прокручиваемой панели
        jsp.setPreferredSize(new Dimension(120, 90));
        // Создать метку для отображения результатов выбора
        jlab = new JLabel("Please choose a operator");
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
            jlab.setText(operator[idx]);
        else jlab.setText("Please choose a operator");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingHelp();
            }
        });
    }
}
