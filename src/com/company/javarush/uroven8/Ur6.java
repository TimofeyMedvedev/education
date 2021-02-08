package com.company.javarush.uroven8;
import java.util.*;
import java.text.*;

public class Ur6 {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Соболев", df.parse("MAY 1 2012"));
        map.put("Сидоров", df.parse("JUN 1 2012"));
        map.put("Лапа", df.parse("JUL 1 2012"));
        map.put("Салимова", df.parse("SEP 1 2012"));
        map.put("Медведев", df.parse("MAY 1 2012"));
        map.put("Иванов", df.parse("OCT 1 2012"));
        map.put("Галко", df.parse("JAN 1 2012"));
        map.put("Лопух", df.parse("FEB 1 2012"));
        map.put("Кочкин", df.parse("AUG 1 2012"));
        map.put("Петренко", df.parse("JUN 1 2012"));
        return map;
    }
    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for(Map.Entry<String, Date> date : copy.entrySet())
            if(date.getValue().getMonth() > 4 & date.getValue().getMonth() < 8)
                map.remove(date.getKey());
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for(Map.Entry<String, Date> date : map.entrySet())
            System.out.println(date.getKey() + " " + date.getValue());
    }
}
