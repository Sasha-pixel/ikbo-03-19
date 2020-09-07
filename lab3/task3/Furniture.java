package ru.mirea.lab3.task3;

public class Furniture {
    private int cost;
    private String color, material, type;

    public Furniture(int cost, String color, String material, String type) {
        this.cost = cost;
        this.color = color;
        this.material = material;
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "cost=" + cost +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
