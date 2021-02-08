package com.company.glava5;

public class Zadanie5glava {
    public static void main(String[] args) {
        double du[] = new double[10];
        double sum = 0;

        for(int i = 0; i < du.length; i++) {
            du[i] = i * 0.88 + i * 2.85 + 6.23;
            sum += du[i];
            System.out.print(du[i] + " ");
        }
        System.out.println("\nСумма: " + sum);
        System.out.println("Среднее арифметическое: " + sum/du.length);
    }
}
