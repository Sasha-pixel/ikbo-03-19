package ru.mirea.lab3.task2;

public class Bulldog extends Dog {
    private String dogBreed;

    public Bulldog(int age, String color) {
        super(age, color);
        this.dogBreed = "bulldog";
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void dogOut() {
        System.out.print("dog breed = " + dogBreed);
        super.dogOut();
    }
}
