package com.company.javarush.uroven19;

import java.io.*;

public class EvenCharter {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String file_1 = reader.readLine();
            String file_2 = reader.readLine();
            try (FileReader fr = new FileReader(file_1);
                 FileWriter fw = new FileWriter(file_2)) {
                int f = 1;
                while (fr.ready()) {
                    int ch = fr.read();
                    if((f % 2) == 0)
                        fw.write(ch);
                    f++;
                }
            } catch (FileNotFoundException exc) {}
        } catch (IOException exc) {}
    }
}
