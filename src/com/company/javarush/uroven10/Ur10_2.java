package com.company.javarush.uroven10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке
*/

public class Ur10_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int count = 1;
        for(int i = 0; i < list.size(); ) {
            String s = list.get(i).toLowerCase();
            for(int j = 1; j < list.size(); j++) {
                if(s.equalsIgnoreCase(list.get(j))) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            result.put(s, count);
            list.remove(i);
            count = 1;
        }
        return result;
    }

}