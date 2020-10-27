package ru.mirea.prac11.task1;

import java.util.Arrays;

public class ArrayQueue {
    private Object[] array = new Object[10];
    private int size = -1;

    public ArrayQueue() {
    }

    public void enqueue(Object t) {
        assert t != null;

        if (this.array.length <= this.size + 1) {
            this.array = Arrays.copyOf(this.array, 2 * (this.size + 1));
        }

        this.array[++this.size] = t;
    }

    public Object element() {
        assert this.size() > 0;
        return this.array[0];
    }

    public Object dequeue() {
        assert this.size() > 0;

        Object obj = this.array[0];
        if (this.size >= 0) {
            System.arraycopy(this.array, 1, this.array, 0, this.size);
            size--;
        }
        return obj;
    }

    public boolean isEmpty() {
        return this.size == -1;
    }

    public int size() {
        return this.size + 1;
    }

    public void clear() {
        this.array = new Object[10];
    }
}
