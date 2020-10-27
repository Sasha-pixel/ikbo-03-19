package ru.mirea.prac11.task2;

public interface Queue {
    void enqueue(Object var1);
    Object element();
    Object dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
