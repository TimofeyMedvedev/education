package com.company.glava10;
import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                str = r.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывода: " + exc);
        }
    }
}
