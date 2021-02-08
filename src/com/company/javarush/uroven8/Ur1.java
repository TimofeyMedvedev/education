package com.company.javarush.uroven8;

import java.util.Map;
import java.util.HashMap;

public class Ur1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> t : map.entrySet()) {
            String key = t.getKey();
            String d = t.getValue();
            System.out.println(key + " - " + d);
        }
    }
}
