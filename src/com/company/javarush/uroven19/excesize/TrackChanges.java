package com.company.javarush.uroven19.excesize;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class TrackChanges {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        ArrayList<String> file_1 = new ArrayList<>();
        ArrayList<String> file_2 = new ArrayList<>();
        String fileName_1 = "";
        String fileName_2 = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName_1 = reader.readLine();
            fileName_2 = reader.readLine();
        } catch (IOException exc) {}

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName_1));
             BufferedReader reader1 = new BufferedReader(new FileReader(fileName_2))) {
            while (reader.ready()) {
                file_1.add(reader.readLine());
            }
            while (reader1.ready()) {
                file_2.add(reader1.readLine());
            }
        } catch (FileNotFoundException exc) {}
          catch (IOException exc) {}

        for(int i = 0; i < file_2.size(); i++) {
            if(file_2.get(i).equals(file_1.get(i)))
                lines.add(new LineItem(Type.SAME, file_1.get(i)));
            else if(file_2.get(i).equals(file_1.get(i+1))) {
                lines.add(new LineItem(Type.REMOVED, file_1.get(i)));
                lines.add(new LineItem(Type.SAME, file_1.get(i+1)));
            }
            else {
                lines.add(new LineItem(Type.ADDED, file_2.get(i)));
                lines.add(new LineItem(Type.SAME, file_1.get(i)));
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}