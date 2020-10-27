package ru.mirea.prac11.task1;

import java.util.Arrays;

public class ArrayQueueModule {
    public static Object[] Array = new Object[10];
    private static int size = -1;

    public void enqueue(Object obj) {
        if (obj != null) {
            Array[size + 1] = obj;
            size++;
        }
    }

    public Object element() {
        if (size >= 0)
            return Array[0];
        else return null;
    }

    public Object dequeue() {
        if (size == -1)
            return null;
        else {
            Object buff = Array[0];
            System.arraycopy(Array, 1, Array, 0, size);
            size--;
            return buff;
        }
    }

    public int size() {
        return size + 1;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public static void clear() {
        Array = new Object[10];
    }
}
