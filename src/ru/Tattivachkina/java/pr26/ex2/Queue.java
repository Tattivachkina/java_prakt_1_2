package ru.Tattivachkina.java.pr26.ex2;

interface Queue {
    void enqueue(Object element);
    Object  dequeue();
    Object[] toArray();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}