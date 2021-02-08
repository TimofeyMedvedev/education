package com.company.javarush.uroven23;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/

public class ReversedWords {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        String fileName = null;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                String[] content = reader.readLine().trim().split("\\s");
                words.addAll(Arrays.asList(content));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < words.size(); i++) {
            String first = words.get(i);
            for(int j = i + 1; j < words.size(); j++) {
                String second = new StringBuilder(words.get(j)).reverse().toString();
                if(first.equals(second)) {
                    Pair pair = new Pair();
                    pair.first = first;
                    pair.second = words.get(j);
                    result.add(pair);
                    words.remove(j);
                    break;
                }
            }
        }

        for(Pair p : result) {
            System.out.println(p);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }
    }
}
