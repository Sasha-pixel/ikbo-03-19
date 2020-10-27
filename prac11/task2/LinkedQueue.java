package ru.mirea.prac11.task2;

public class LinkedQueue extends AbstractQueue implements Queue{
    Node current = null;

    public static class Node {
        Node next = null;
        Node previous = null;
        Object value;

        public Node(Object value) {
            this.value = value;
        }
    }

    @Override
    public void enqueue(Object value) {
        Node node = new Node(value);
        if (isEmpty()) {
            current = node;
        } else {
            current.next = node;
            node.previous = current;
            current = node;
        }
        size++;
    }

    @Override
    public Object element() {
        while (current.previous != null)
            current = current.previous;
        return current.value;
    }

    @Override
    public Object dequeue() {
        while (current.previous != null)
            current = current.previous;
        Node buf = current;
        if (current.next != null) {
            current = current.next;
            current.previous.next = null;
            current.previous = null;
        }
        size--;
        return buf.value;
    }

    @Override
    public void clear() {
        while(current.next != null) {
            current = current.next;
            current.previous.next = null;
            current.previous = null;
        }
    }
}
