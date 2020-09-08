package ru.mirea.lab4;

public class Human implements  Nameable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
