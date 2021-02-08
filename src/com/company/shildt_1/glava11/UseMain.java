package com.company.glava11;

public class UseMain {
    public static void main(String[] args) {
        Thread th;

        th = Thread.currentThread();

        System.out.println("Имя основного потока: " + th.getName());

        System.out.println("Приоритет: " + th.getPriority());
        System.out.println();
        System.out.println("Установка имени и приоритета\n");
        th.setName("Thread #1");
        th.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("Новое имя потока: " + th.getName());
        System.out.println("Новое значение приоритета: " + th.getPriority());
    }
}
