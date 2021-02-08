package com.company.javarush.uroven17.crud;
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

        switch (args[0]) {
            case "-c" :
                Date date = sdf.parse(args[3]);
                if(sex(args[2]))
                    allPeople.add(Person.createMale(args[1], date));
                else allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size() - 1);
                break;
            case "-u" :
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (sex(args[3]))
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                else allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                Date dat = sdf.parse(args[4]);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(dat);
                break;
            case "-d" :
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                System.out.println(allPeople.get(Integer.parseInt(args[1])).toString());
                break;
            case "-i" :
                System.out.println(allPeople.get(Integer.parseInt(args[1])).toString());
                break;
        }
    }

    public static boolean sex(String s) {
        if(s == "м")
            return true;
        return false;
    }
}