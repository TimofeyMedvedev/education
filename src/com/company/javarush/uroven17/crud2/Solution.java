package com.company.javarush.uroven17.crud2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = args.length - 1;

        switch (args[0]) {
            case "-c" :
                synchronized (allPeople) {
                    n /= 3;
                    for (int i = 0; i < args.length - n; i += 3) {
                        Date date = sdf.parse(args[i + 3]);
                        if (sex(args[i + 2]))
                            allPeople.add(Person.createMale(args[i + 1], date));
                        else allPeople.add(Person.createFemale(args[i + 1], date));
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            case "-u" :
                synchronized (allPeople) {
                    n /= 4;
                    for (int i = 0; i < args.length - n; i += 4) {
                        allPeople.get(Integer.parseInt(args[i + 1])).setName(args[i + 2]);
                        if (sex(args[i + 3]))
                            allPeople.get(Integer.parseInt(args[i + 1])).setSex(Sex.MALE);
                        else allPeople.get(Integer.parseInt(args[i + 1])).setSex(Sex.FEMALE);
                        Date dat = sdf.parse(args[i + 4]);
                        allPeople.get(Integer.parseInt(args[i + 1])).setBirthDate(dat);
                    }
                    break;
                }
            case "-d" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                        System.out.println(allPeople.get(Integer.parseInt(args[i])).toString());
                    }
                    break;
                }
            case "-i" :
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        System.out.println(allPeople.get(Integer.parseInt(args[i])).toString());
                    }
                    break;
                }

        }
    }

    public static boolean sex(String s) {
        if(s == "м")
            return true;
        return false;
    }
}