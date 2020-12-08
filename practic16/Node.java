package ru.mirea.practic16;

public class Node {
    Node next;
    Node prev;
    Item item;

    public Node(Node prev, Item item, Node next) {
        this.next = next;
        this.prev = prev;
        this.item = item;
    }

    public Node(Item item) {
        this((Node)null, item, (Node)null);
    }
}
