package ru.mirea.lab3.task2;
import java.util.Scanner;

public class dogTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color;
        int age;
        System.out.println("Введите возраст и цвет ретривера:");
        age = scan.nextInt();
        color = scan.next();
        Retriever retriever = new Retriever(age, color);
        retriever.dogOut();
        System.out.println("Введите возраст и цвет бульдога:");
        age = scan.nextInt();
        color = scan.next();
        Bulldog bulldog = new Bulldog(age, color);
        bulldog.dogOut();
    }
}
