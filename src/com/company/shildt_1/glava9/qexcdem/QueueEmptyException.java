package com.company.glava9.qexcdem;

class QueueEmptyException extends Exception {
    public String toString() {
        return "\nОчередь пуста.";
    }
}
