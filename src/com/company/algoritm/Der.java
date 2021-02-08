//package com.company.algoritm;
//
//public class Binar {
//    public int binary(int a[], int b) {
//        int low = 0;
//        int hihh = a.length - 1;
//
//        while (low <= hihh) {
//            int mid = (low + hihh) / 2;
//            if (a[mid] == b)
//                return mid;
//            else if (a[mid] < b)
//                low = mid + 1;
//            else if (a[mid] > b)
//                hihh = mid - 1;
//        }
//    }
//}
//public class Der {
//    public static void main(String[] args) {
//        int sample[] = new int[10];
//
//        for(int i = 0; i < 10; i++)
//            sample[i] = i;
//
//        Binar s = new Binar();
//
//        System.out.println("Позиция в массиве искомого значения: " + s.binary(sample, 7));
//    }
//}
