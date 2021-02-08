package com.company.glava10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);
            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);
            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);
            System.out.println("Записано: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException exc) {
            System.out.println("Ошибка при записи");
            return;
        }

        System.out.println();

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();
            System.out.println("Прочитано: " + i);
            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);
            b = dataIn.readBoolean();
            System.out.println("Прочитано: " + b);
            d = dataIn.readDouble();
            System.out.println("Прочитано: " + d);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении");
        }
    }
}
