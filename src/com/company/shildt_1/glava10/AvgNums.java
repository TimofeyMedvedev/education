package com.company.glava10;
import java.io.*;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("Сколько чисел вы введете: ");
        s = r.readLine();
        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException exc) {
            System.out.println("Неверный формат");
            n = 0;
        }
        System.out.println("Ввод " + n + " значений");
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            s = r.readLine();
            try {
                t = Double.parseDouble(s);
            } catch (NumberFormatException exc) {
                System.out.println("Неверный формат");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Среднее значение: " + avg);
    }
}
