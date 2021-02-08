package com.company.javarush.uroven19;

import java.io.*;

public class SolveAnExample {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        String file = "";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file = reader.readLine();
        } catch (IOException exc) {}

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        System.setOut(ps);

        testString.printSomething();

        String result = baos.toString().trim();

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(result.getBytes());
        } catch (IOException exc) {}

        System.setOut(consoleStream);

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}