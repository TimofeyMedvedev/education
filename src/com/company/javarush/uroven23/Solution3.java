package com.company.javarush.uroven23;

import java.util.HashMap;
import java.util.Map;

/*
Формируем WHERE
*/

public class Solution3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        if(params.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> pair : params.entrySet()) {
            if(pair.getValue() != null) {
                sb.append(" and ");
                sb.append(pair.getKey()).append(" = '").append(pair.getValue()).append("'");
            }
        }
        sb.delete(0, 5);
        return sb.toString();
    }
}
