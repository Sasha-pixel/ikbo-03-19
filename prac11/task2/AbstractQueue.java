package ru.mirea.prac11.task2;

public abstract class AbstractQueue {
    protected int size = -1;

    public AbstractQueue() {}

    public boolean isEmpty() {
        return this.size == -1;
    }

    public int size() {
        return this.size + 1;
    }
}
