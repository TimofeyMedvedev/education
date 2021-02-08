package com.company.glava5;

public class Ragged {
    public static void main(String[] args) {
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int j, i;
        int sum1 = 0, sum2 = 0;

        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
                sum1 += riders[i][j];
            }
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
                sum2 += riders[i][j];
            }

        System.out.println("Колличество пассажиров, перевезенных каждым " +
                "рейсом, в будние дни недели:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Общее колличество пассажиров перевезенных в будние дни: " + sum1);
        System.out.println();

        System.out.println("Колличество пассажиров, перевезенных каждым " +
                "рейсом, в выходные дни:");
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Общее колличество пассажиров перевезенных в выходные дни: " + sum2);
        System.out.println("Общее колличество пассажиров перевезенных за неделю: " + (sum1 + sum2));
    }
}