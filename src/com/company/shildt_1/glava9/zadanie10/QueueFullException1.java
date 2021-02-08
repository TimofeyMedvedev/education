package com.company.glava9.zadanie10;

class QueueFullException1 extends Exception {
    int size;

    QueueFullException1(int s) {size = s; }

    public String toString() {
        return "\nСтэк заполнен. Максимальный размер стэка: " + size;
    }
}