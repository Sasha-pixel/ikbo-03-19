package ru.mirea.prac11.task2;

import ru.mirea.prac11.task1.ArrayQueue;

public class Test {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(10);
        queue.enqueue(19);
        queue.enqueue(4);
        System.out.println("size = " + queue.size());
        System.out.println("first element is " + queue.dequeue());
        System.out.println("size = " + queue.size());
        if (queue.isEmpty())
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
        System.out.println("first element is " + queue.dequeue());
        System.out.println("first element is " + queue.dequeue());
        System.out.println("size = " + queue.size());
        if (queue.isEmpty())
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
    }
}
