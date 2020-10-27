package ru.mirea.prac11.task1;

public class ArrayModuleQueueTest {
    public static void main(String[] args) {
        ArrayQueueModule queueModule = new ArrayQueueModule();
        queueModule.enqueue(10);
        queueModule.enqueue(19);
        queueModule.enqueue(4);
        System.out.println("size = " + queueModule.size());
        System.out.println("first element is " + queueModule.dequeue());
        System.out.println("size = " + queueModule.size());
        if (queueModule.isEmpty())
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
        System.out.println("first element is " + queueModule.dequeue());
        System.out.println("first element is " + queueModule.dequeue());
        System.out.println("size = " + queueModule.size());
        if (queueModule.isEmpty())
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
    }
}
