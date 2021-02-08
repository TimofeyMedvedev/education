package com.company.glava13.CircularQueue;

import com.company.glava13.Queue.IGenQ;
import com.company.glava13.Queue.QueueEmptyException;
import com.company.glava13.Queue.QueueFullException;

public class GenCircularQueue<T> implements IGenQ<T> {
    private T q[];
    private int putloc, getloc;

    public GenCircularQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    public void put(T obj) throws QueueFullException {
        if(putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0)))
            throw new QueueFullException(q.length);

        putloc++;
        if(putloc == q.length) putloc = 0;
        q[putloc] = obj;
    }

    public T get() throws QueueEmptyException {
        if(getloc == putloc) {
            throw new QueueEmptyException();
        }

        getloc++;
        if(getloc == q.length) getloc = 0;
        return q[getloc];
    }
}
