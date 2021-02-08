package com.company.javarush.uroven19.excesize.xyan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] data = reader.readLine().trim().split(" ");
                if(data.length > 3) {
                    if (data.length == 4) {
                        Date date = sdf.parse(data[1] + " " + data[2] + " " + data[3]);
                        PEOPLE.add(new Person(data[0], date));
                    } else if (data.length == 5) {
                        Date date = sdf.parse(data[2] + " " + data[3] + " " + data[4]);
                        PEOPLE.add(new Person(data[0] + " " + data[1], date));
                    } else if (data.length == 6) {
                        Date date = sdf.parse(data[3] + " " + data[4] + " " + data[5]);
                        PEOPLE.add(new Person(data[0] + " " + data[1] + " " + data[2], date));
                    }
                }
            }
        } catch (Exception exc) {}

        for(Person p : PEOPLE) {
            System.out.println(p.getName() + " " + p.getBirthDate());
        }
    }
}