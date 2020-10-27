package ru.mirea.prac11.task2;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue implements Queue {
    private Object[] array = new Object[10];

    public ArrayQueue() {}

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
        Object t = this.array[0];
        if (this.size >= 0) {
            System.arraycopy(this.array, 1, this.array, 0, this.size);
            this.size--;
        }
        return t;
    }

    public void clear() {
        this.array = new Object[10];
    }
}
