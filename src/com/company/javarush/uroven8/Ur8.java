package com.company.javarush.uroven8;
import java.util.*;

public class Ur8 {
    public static Map<String, Integer> creasteMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Соболев", 500);
        map.put("Сидоров", 789);
        map.put("Лапа", 367);
        map.put("Салимова", 980);
        map.put("Медведев", 1234);
        map.put("Иванов", 450);
        map.put("Галко", 240);
        map.put("Лопух", 560);
        map.put("Кочкин", 690);
        map.put("Петренко", 370);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
//        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, Integer> pair = it.next();
//            Integer t = pair.getValue();
//            if (t < 500)
//                it.remove();
//        }
        map.entrySet().removeIf(y -> (y.getValue() < 500));
    }

    public static void main(String[] args) {
        Map<String, Integer> map = creasteMap();
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
