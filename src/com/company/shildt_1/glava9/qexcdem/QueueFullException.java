package com.company.glava9.qexcdem;

class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {size = s; }

    public String toString() {
        return "\nОчередь заполнена. Максимальный размер очереди: " + size;
    }
}