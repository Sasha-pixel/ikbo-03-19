package ru.mirea.lab3.task2;

public abstract class Dog {
    private int age;
    private String color;

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void dogOut() {
        System.out.println(", age = " + age + ", color = " + color);
    }
}
