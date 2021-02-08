package com.company.glava9.qexcdem;

public interface ICharQQ {
        void put(char ch) throws QueueFullException;
        char get() throws QueueEmptyException;
    }
