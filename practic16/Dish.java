package ru.mirea.practic16;

public final class Dish implements Item {
    public final double cost;
    public final String title;
    public final String description;

    public Dish(double cost, String title, String description) {
        if (!title.equals("") && !description.equals("") && cost != 0.0D) {
            this.cost = cost;
            this.title = title;
            this.description = description;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Dish(String title, String description) {
        this.title = title;
        this.description = description;
        this.cost = 0.0D;
    }

    public double getCost() {
        return this.cost;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return "Блюдо: стоимость = " + this.cost + ", название = '" + this.title + '\'' + ", описание = '" + this.description + '\'';
    }
}
