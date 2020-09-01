package ru.mirea.practic1;

public class book {
    String type;

    void set(String type) {
        this.type=type;
    }



    @Override
    public String toString() {
        return "book{" +
                "type='" + type + '\'' +
                '}';
    }
}
