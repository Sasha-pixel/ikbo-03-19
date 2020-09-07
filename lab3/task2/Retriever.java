package ru.mirea.lab3.task2;

public class Retriever extends Dog {
    private String dogBreed;

    public Retriever(int age, String color) {
        super(age, color);
        this.dogBreed = "retriever";
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void dogOut() {
        System.out.print("dog breed = " + dogBreed);
        super.dogOut();
    }
}
