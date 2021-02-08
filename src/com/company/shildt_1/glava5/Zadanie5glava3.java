package com.company.glava5;

public class Zadanie5glava3 {
    public static void main(String args[]) {
        String nums[] = {"this", "is", "a", "test", "of", "the", "string", "sort"};
        int a, b;
        String t;
        int size;
        size = nums.length ;

        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1].compareTo(nums[b]) > 0) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        System.out.print("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
