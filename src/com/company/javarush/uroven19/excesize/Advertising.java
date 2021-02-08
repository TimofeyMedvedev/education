package com.company.javarush.uroven19.excesize;

/*
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Advertising {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        System.setOut(ps);

        testString.printSomething();

        String[] result = baos.toString().trim().split("\n");
        String resultEnd = "";
        for(int i = 0; i < result.length; i++) {
            if((i % 2) != 0.0)
                resultEnd += result[i] + "\n" + "JavaRush - курсы Java онлайн\n";
            else resultEnd += result[i] + "\n";
        }

        System.setOut(consoleStream);

        System.out.println(resultEnd);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}