package com.company.javarush.uroven19;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReaderWrapper {
    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        System.setOut(ps);

        printSomething();

        String result = baos.toString().toUpperCase();

        System.setOut(consoleStream);

        System.out.println(result);
    }

    public static void printSomething() {
        System.out.println("Hello, my dear friend!");
    }
}
