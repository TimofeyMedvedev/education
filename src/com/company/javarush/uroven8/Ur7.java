package com.company.javarush.uroven8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Ur7 {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Соболев", "Тима");
        map.put("Сидоров", "Тима");
        map.put("Лапа", "Тимур");
        map.put("Салимова", "Вася");
        map.put("Медведев", "Костя");
        map.put("Иванов", "Вася");
        map.put("Галко", "Алина");
        map.put("Лопух", "Ярослав");
        map.put("Кочкин", "Петя");
        map.put("Петренко", "Ярослав");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        int count = 0;
        ArrayList<String> list = new ArrayList<>(map.values());
        for(String s : list) {
            for(String t : map.values()) {
                if (s.equals(t))
                    count++;
            }
            if(count > 1)
                removeItemFromMapByValue(map, s);
            count = 0;
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

    }
}