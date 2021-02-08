package com.company.javarush.uroven8;
import java.util.*;

/*
Перепись населения
*/

public class Ur5 {
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
        map.put("Петренко", "Люда");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for(String str : map.values()) {
            if (str.equalsIgnoreCase(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for(String str : map.keySet()) {
            if (str.equalsIgnoreCase(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Тим"));
        System.out.println(getCountTheSameLastName(map, "Медедев"));
    }
}