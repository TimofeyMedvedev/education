package com.company.glava13.CircularQueue;

import com.company.glava13.Queue.QueueEmptyException;
import com.company.glava13.Queue.QueueFullException;

public class GenCircularQDemo {
    public static void main(String[] args) {
        Integer n[] = new Integer[10];
        GenCircularQueue<Integer> iOb = new GenCircularQueue<>(n);

        int i;
        Integer iVal;

        System.out.println("Демонстрация круговой очереди чисел типа Integer");
        try {
            for (i = 0; i < 10; i++) {
            System.out.println("Добавление " + i + " в очередь iOb");
            iOb.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.print("Содержимое кольцевой очереди: ");
        try {
            for (i = 0; i < 10; i++) {
            iVal = iOb.get();
            System.out.print(iVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();
        try {
            for (i = 10; i < 20; i++) {
                System.out.println("Добавление " + i + " в очередь iOb");
                iOb.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.print("Содержимое кольцевой очереди: ");
        try {
            for (i = 0; i < 10; i++) {
                iVal = iOb.get();
                System.out.print(iVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("\nСохранение и использование данных" +
                " кольцевой очереди");
        try {
            for (i = 0; i < 20; i++) {
                iOb.put(i);
                iVal = iOb.get();
                System.out.print(iVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
    }
}
