package com.company.glava13.Stack;

public class StackFullException extends Exception {
    int size;

    StackFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nСтэк заполнен. Максимальный размер стэка: " + size;
    }
}
