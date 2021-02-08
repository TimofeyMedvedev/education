package com.company.javarush.uroven22;

import java.io.*;
import java.util.Properties;

/*
Читаем конфиги
*/

public class PropertiesDemo {
    public static void main(String[] args) {
        PropertiesDemo solution = new PropertiesDemo();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();

        if (fileName.endsWith(".xml")) {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                properties.loadFromXML(fis);
            } catch (IOException exc) {
                return properties;
            }
        }

        else {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                properties.load(fis);
            } catch (IOException exc) {
                return properties;
            }
        }
        return properties;
    }
}