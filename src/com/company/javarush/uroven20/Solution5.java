package com.company.javarush.uroven20;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Serializable Solution
*/
public class Solution5 implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution5(4));
        Solution5 savedObject = new Solution5(4);
        File fileName = new File("C:\\Users\\homit\\IdeaProjects\\Example\\fest.txt");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(savedObject);
        } catch (IOException exc) {}


        Solution5 loadedObject = new Solution5(7);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            loadedObject = (Solution5) ois.readObject();
        } catch (IOException | ClassNotFoundException exc) {}

        System.out.println(savedObject + "\r\n" + loadedObject);
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution5(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
