package ru.mirea.prac11.task1;

public class ArrayQueueADTTest {
    public static void main(String[] args) {
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, 10);
        ArrayQueueADT.enqueue(queueADT, 19);
        ArrayQueueADT.enqueue(queueADT, 4);
        System.out.println("size = " + ArrayQueueADT.size(queueADT));
        System.out.println("first element is " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("size = " + ArrayQueueADT.size(queueADT));
        if (ArrayQueueADT.isEmpty(queueADT))
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
        System.out.println("first element is " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("first element is " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("size = " + ArrayQueueADT.size(queueADT));
        if (ArrayQueueADT.isEmpty(queueADT))
            System.out.println("queue is empty");
        else
            System.out.println("queue is not empty");
    }
}
