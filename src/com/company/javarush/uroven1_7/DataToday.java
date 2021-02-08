package com.company.javarush.uroven1_7;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataToday {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM y");
        System.out.println("\"" + sdf.format(date) + "\"");
    }
}
