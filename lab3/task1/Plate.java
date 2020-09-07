package ru.mirea.lab3.task1;

public class Plate extends Dish {
    private int radius;
    private boolean depth;

    public Plate(String size, String color, int radius, boolean depth) {
        super(size, color);
        this.radius = radius;
        this.depth = depth;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setDepth(boolean depth) {
        this.depth = depth;
    }

    public int getRadius() {
        return radius;
    }

    public boolean getDepth() {
        return depth;
    }

    public void dishOut() {
        super.dishOut();
        System.out.println(", radius = " + radius + ", is it deep = " + depth);
    }
}
