package com.company.javarush.uroven9;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ur9_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String date = r.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dat = sdf.parse(date);
        System.out.println(new Date());

        SimpleDateFormat sdf1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(sdf1.format(dat).toUpperCase());
    }
}
