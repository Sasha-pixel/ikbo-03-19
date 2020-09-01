package ru.mirea.practic1;

public class ball {
    String type, color;

    void set(String type, String color) {
        this.type=type;
        this.color=color;
    }



    @Override
    public String toString() {
        return "ball{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
