package ru.mirea.lab3.task1;

public class Cup extends Dish {
    private int radius;

    public Cup(String size, String color, int radius) {
        super(size, color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void dishOut() {
        super.dishOut();
        System.out.println(", radius = " + radius);
    }
}
