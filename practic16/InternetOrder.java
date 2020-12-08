package ru.mirea.practic16;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class InternetOrder implements Order {
    private OrderList list;

    public InternetOrder() {
        this.list = new OrderList();
    }

    public InternetOrder(Collection<Item> collection) {
        this.list = new OrderList(collection);
    }

    public boolean addItem(Item item) {
        return this.list.addEnd(item);
    }

    public boolean deleteByTitle(String title) {
        Item current = null;
        Item[] var3 = this.list.toArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Item item = var3[var5];
            if (item.getTitle().equals(title)) {
                current = item;
            }
        }

        return this.list.remove(current);
    }

    public int deleteAllByTitle(String title) {
        int k = 0;
        Item[] var3 = this.list.toArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Item item = var3[var5];
            if (item.getTitle().equals(title)) {
                ++k;
                this.list.remove(item);
            }
        }

        return k;
    }

    public int getNumOfOrders() {
        return this.list.size();
    }

    public Item[] getArrOfItems() {
        return this.list.toArray();
    }

    public double getFullCost() {
        double fullCost = 0.0D;
        Item[] var3 = this.list.toArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Item item = var3[var5];
            fullCost += item.getCost();
        }

        return fullCost;
    }

    public int getNumOfItemsByTitle(String title) {
        int k = 0;
        Item[] var3 = this.list.toArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Item item = var3[var5];
            if (item.getTitle().equals(title)) {
                ++k;
            }
        }

        return k;
    }

    public String[] getTitles() {
        Set<String> set = new HashSet();
        Item[] var3 = this.list.toArray();
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Item item = var3[var5];
            set.add(item.getTitle());
        }

        String[] current = new String[set.size()];
        int k = 0;

        for(Iterator var8 = set.iterator(); var8.hasNext(); ++k) {
            String s = (String)var8.next();
            current[k] = s;
        }

        return current;
    }

    public void getSortedArrOfItems() {
        Stream var10000 = Arrays.stream(this.list.toArray()).sorted(new InternetOrder.ComparatorForItems());
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }

    class ComparatorForItems implements Comparator<Item> {
        ComparatorForItems() {
        }

        public int compare(Item o1, Item o2) {
            return (int)(o1.getCost() - o2.getCost());
        }
    }
}
