package ru.mirea.practic16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class OrderManager {
    private HashMap<Integer, RestaurantOrder> restaurantOrders = new HashMap();
    private HashMap<String, InternetOrder> internetOrders = new HashMap();

    public OrderManager() {
    }

    public boolean addOrder(Integer tableNum, RestaurantOrder order) throws Exception {
        if (this.restaurantOrders.containsKey(tableNum)) {
            throw new Exception("OrderAlreadyAddedException");
        } else {
            this.restaurantOrders.put(tableNum, order);
            return true;
        }
    }

    public boolean addOrder(String address, InternetOrder order) throws Exception {
        if (this.internetOrders.containsKey(address)) {
            throw new Exception("OrderAlreadyAddedException");
        } else {
            this.internetOrders.put(address, order);
            return true;
        }
    }

    public Order gerOrder(int tableNum) {
        return this.restaurantOrders.containsKey(tableNum) ? (Order)this.restaurantOrders.get(tableNum) : null;
    }

    public Order getOrder(String address) {
        return this.internetOrders.containsKey(address) ? (Order)this.internetOrders.get(address) : null;
    }

    public boolean removeOrder(int tableNum) {
        if (this.restaurantOrders.containsKey(tableNum)) {
            this.restaurantOrders.remove(tableNum);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeOrder(String address) {
        if (this.internetOrders.containsKey(address)) {
            this.internetOrders.remove(address);
            return true;
        } else {
            return false;
        }
    }

    public void addItem(int tableNum, Item item) {
        ((RestaurantOrder)this.restaurantOrders.get(tableNum)).addItem(item);
    }

    public void addItem(String address, Item item) {
        ((InternetOrder)this.internetOrders.get(address)).addItem(item);
    }

    public InternetOrder[] getArrOfInternetOrders() {
        InternetOrder[] current = new InternetOrder[this.internetOrders.size()];
        int k = 0;

        for(Iterator var3 = this.internetOrders.entrySet().iterator(); var3.hasNext(); ++k) {
            Entry<String, InternetOrder> pair = (Entry)var3.next();
            current[k] = (InternetOrder)pair.getValue();
        }

        return current;
    }

    public RestaurantOrder[] getArrOfRestaurantOrders() {
        RestaurantOrder[] current = new RestaurantOrder[this.restaurantOrders.size()];
        int k = 0;

        for(Iterator var3 = this.restaurantOrders.entrySet().iterator(); var3.hasNext(); ++k) {
            Entry<Integer, RestaurantOrder> pair = (Entry)var3.next();
            current[k] = (RestaurantOrder)pair.getValue();
        }

        return current;
    }

    public double getFullCostByInternetOrders() {
        double fullCost = 0.0D;

        Order order;
        for(Iterator var3 = this.internetOrders.values().iterator(); var3.hasNext(); fullCost += order.getFullCost()) {
            order = (Order)var3.next();
        }

        return fullCost;
    }

    public double getFullCostByRestaurantOrders() {
        double fullCost = 0.0D;

        Order order;
        for(Iterator var3 = this.restaurantOrders.values().iterator(); var3.hasNext(); fullCost += order.getFullCost()) {
            order = (Order)var3.next();
        }

        return fullCost;
    }

    public int getNumberOfItemsByTitleInternet(String title) {
        int number = 0;

        Order order;
        for(Iterator var3 = this.internetOrders.values().iterator(); var3.hasNext(); number += order.getNumOfItemsByTitle(title)) {
            order = (Order)var3.next();
        }

        return number;
    }

    public int getNumberOfItemsByTitleRestaurant(String title) {
        int number = 0;

        Order order;
        for(Iterator var3 = this.restaurantOrders.values().iterator(); var3.hasNext(); number += order.getNumOfItemsByTitle(title)) {
            order = (Order)var3.next();
        }

        return number;
    }
}
