package com.company.glava13.Stack;

public interface IGenS<T> {
    void push(T ch) throws StackFullException;
    T pop() throws StackEmptyException;
}
