package ru.mirea.practic16;

public final class Drink implements Item {
    public final double cost;
    public final String title;
    public final String description;

    public Drink(String title, String description) {
        this.title = title;
        this.description = description;
        this.cost = 0.0D;
    }

    public Drink(double cost, String title, String description) {
        if (!title.equals("") && !description.equals("") && cost != 0.0D) {
            this.cost = cost;
            this.title = title;
            this.description = description;
        } else {
            throw new IllegalArgumentException();
        }
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
        return "Напиток: стоимость = " + this.cost + ", название = '" + this.title + '\'' + ", описание = '" + this.description + '\'';
    }
}

