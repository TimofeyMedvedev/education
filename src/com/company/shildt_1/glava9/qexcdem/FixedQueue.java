package com.company.glava9.qexcdem;

class FixedQueue implements ICharQQ {
    private char q[];
    private  int putloc, getloc;

    public FixedQueue (int size) {
        q = new char[size +1];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if(putloc == q.length - 1)
            throw new QueueFullException(q.length - 1);

        putloc++;
        q[putloc] = ch;
    }

    public char get() throws QueueEmptyException {
        if(getloc == putloc) {
            throw new QueueEmptyException();
        }
        getloc++;
        return q[getloc];
    }
}