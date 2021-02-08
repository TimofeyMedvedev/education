//package com.company.glava13.DynQueue;
//
//import com.company.glava13.Queue.IGenQ;
//import com.company.glava13.Queue.QueueEmptyException;
//
//public class GenDynQueue<T> implements IGenQ<T> {
//    private T q[];
//    private  int putloc, getloc;
//
//    public GenDynQueue (T[] aRef) {
//        q = aRef;
//        putloc = getloc = 0;
//    }
//
//    public void put(T obj) {
//        if (putloc == q.length - 1) {
//            T t[] = new T[q.length * 2];
//
//            for (int i = 0; i < q.length; i++)
//                t[i] = q[i];
//            q = t;
//        }
//        q[putloc++] = obj;
//    }
//
//    public T get() throws QueueEmptyException {
//        if(getloc == putloc) {
//            throw new QueueEmptyException();
//        }
//        return q[getloc++];
//    }
//}
