package com.company.javarush.uroven10;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int count = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                char[] ch = list.get(j).toCharArray();
                for (int k = 0; k < ch.length; k++) {
                    if (alphabet.get(i) == ch[k])
                        count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
            count = 0;
        }
    }
}