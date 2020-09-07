package ru.mirea.lab2;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.print(circle);
        System.out.print("\nВведите радиус: ");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        circle.changeRadius(r);
        System.out.print(circle);
    }
}
