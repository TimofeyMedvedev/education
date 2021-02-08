package com.company.javarush.uroven22.classAbstractLIST;

/*
Построй дерево
*/

import java.io.Serializable;
import java.util.*;

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;
    private List<Entry<String>> list = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        list.add(root);
    }

    @Override
    public boolean add(String s) {
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        Entry<String> current = new Entry<>(s);
        list.add(current);

        while (!queue.isEmpty()) {
            Entry<String> knot = queue.remove();

            if (knot.leftChild == null && knot.rightChild == null) {
                knot.availableToAddLeftChildren = true;
                knot.availableToAddRightChildren = true;
            }

            if(knot.availableToAddLeftChildren) {
                knot.leftChild = current;
                current.parent = knot;
                knot.availableToAddLeftChildren = false;
                return true;
            }
            else {
                if(knot.leftChild != null)
                    queue.add(knot.leftChild);
            }

            if(knot.availableToAddRightChildren) {
                knot.rightChild = current;
                current.parent = knot;
                knot.availableToAddRightChildren = false;
                return true;
            }
            else {
                if(knot.rightChild != null)
                    queue.add(knot.rightChild);
            }
        }
        return false;
    }

    public String getParent(String s) {
        for(Entry<String> entry : list) {
            if(entry.elementName.equals(s))
                return entry.parent.elementName;
        }
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if(!(o instanceof String))
            throw new UnsupportedOperationException();

        String remove = (String) o;
        Entry<String> removed = null;

        for (Entry<String> entry : list) {
            if (entry.elementName.equals(remove)) {
                removed = entry;
                break;
            }
        }

        if(removed == null)
            return false;

        if (removed.leftChild != null)
            remove(removed.leftChild.elementName);

        if (removed.rightChild != null)
            remove(removed.rightChild.elementName);


        if (removed.parent.leftChild == removed)
            removed.parent.leftChild = null;
        else
            removed.parent.rightChild = null;
        list.remove(removed);

        return true;
    }

    @Override
    public int size() {
        return list.size() - 1;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
