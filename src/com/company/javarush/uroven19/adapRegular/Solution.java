package com.company.javarush.uroven19.adapRegular;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.DateFormat;

public class Solution {
    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] str = fileScanner.nextLine().trim().split(" ", 4);
            DateFormat df = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            try {
                Date data = df.parse(str[3]);
                return new Person(str[1], str[2], str[0], data);
            } catch (ParseException exc) {
                return null;
            }
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
