package ru.mirea.practic1;

public class dog {

    String name, color;
    int age;

    void set(String name, int age, String color) {
        this.name=name;
        this.age=age;
        this.color=color;
    }



    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
