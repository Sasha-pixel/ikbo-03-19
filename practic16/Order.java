package ru.mirea.practic16;

public interface Order {
    boolean addItem(Item var1);

    boolean deleteByTitle(String var1);

    int deleteAllByTitle(String var1);

    int getNumOfOrders();

    Item[] getArrOfItems();

    double getFullCost();

    int getNumOfItemsByTitle(String var1);

    String[] getTitles();

    void getSortedArrOfItems();
}
