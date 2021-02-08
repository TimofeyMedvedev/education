package com.company.javarush.uroven8;
import java.util.*;

public class DateD {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JAN 3 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dat = new Date(date);
        Date start = new Date();
        start.setYear(dat.getYear());
        start.setHours(0);
        start.setMinutes(0);
        start.setSeconds(0);
        start.setMonth(0);
        start.setDate(0);
        long lg = dat.getTime() - start.getTime();
        long r = 24*60*60*1000;
        int d = (int) (lg/r) + 1;
        if(d % 2 != 0)
            return true;
        else return false;
    }
}
