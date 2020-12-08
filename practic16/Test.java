package ru.mirea.practic16;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        Item dish = new Dish(550.0D, "Выпечка", "Шоколадный торт");
        Item drink = new Drink(100.0D, "Чай", "Зеленый чай");
        Item drink1 = new Drink(150.0D, "Напиток", "Coca-cola");
        Order internetOrder = new InternetOrder();
        internetOrder.addItem(dish);
        internetOrder.addItem(drink);
        internetOrder.addItem(drink1);
        System.out.println(Arrays.toString(internetOrder.getArrOfItems()));
        System.out.println("Отсортированный");
        internetOrder.getSortedArrOfItems();
        internetOrder.deleteByTitle("Чай");
        System.out.println(Arrays.toString(internetOrder.getArrOfItems()));
        RestaurantOrder order1 = new RestaurantOrder();
        order1.addItem(drink1);
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder("Moscow", (InternetOrder)internetOrder);
        orderManager.addOrder(23, order1);
        InternetOrder[] internetOrders = orderManager.getArrOfInternetOrders();

        for(int i = 0; i < internetOrders.length; ++i) {
            System.out.println(Arrays.toString(internetOrders[i].getTitles()));
            System.out.println(internetOrders[i].getFullCost());
        }

    }
}
