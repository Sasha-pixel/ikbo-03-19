package ru.mirea.lab3.task1;

public abstract class Dish {
    private String size, color;

    public Dish(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void dishOut() {
        System.out.print("size = " + size + ", color = " + color);
    }
}
