package ru.mirea.practic16;

import java.util.Collection;
import java.util.Iterator;

public class OrderList {
    private Node front;
    private int size;

    public OrderList() {
        this.front = null;
        this.size = 0;
    }

    public OrderList(Collection<Item> collection) {
        this.addAll(collection);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean addEnd(Item item) {
        if (item == null) {
            return false;
        } else {
            if (this.isEmpty()) {
                this.front = new Node(item);
            } else {
                Node temp;
                for(temp = this.front; temp.next != null; temp = temp.next) {
                }

                temp.next = new Node(temp, item, (Node)null);
            }

            ++this.size;
            return true;
        }
    }

    private void addAll(Collection<Item> collection) {
        Iterator var2 = collection.iterator();

        while(var2.hasNext()) {
            Item item = (Item)var2.next();
            if (item != null) {
                this.addEnd(item);
            }
        }

    }

    public boolean remove(Item item) {
        if (this.isEmpty()) {
            return false;
        } else if (this.front.item.equals(item)) {
            this.front = this.front.next;
            --this.size;
            return true;
        } else {
            Node current;
            for(current = this.front; current != null && !current.item.equals(item); current = current.next) {
            }

            if (current == null) {
                return false;
            } else {
                if (current.next != null) {
                    current.next.prev = current.prev;
                }

                current.prev.next = current.next;
                --this.size;
                return true;
            }
        }
    }

    public Item[] toArray() {
        Item[] items = new Item[this.size];
        int i = 0;

        for(Node node = this.front; node != null; node = node.next) {
            items[i++] = node.item;
        }

        return items;
    }
}
