package com.company.javarush.uroven9;
/*
Логирование стек-трейса
*/

public class Stack1 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
            System.out.println(st[2].getClassName() + ": " + st[2].getMethodName() + ": " + s);
    }
}