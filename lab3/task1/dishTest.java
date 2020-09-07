package ru.mirea.lab3.task1;
import java.util.Scanner;

public class dishTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size, color;
        int radius;
        boolean depth;
        System.out.println("Введите размер, цвет и радиус чашки:");
        size = scan.nextLine();
        color = scan.nextLine();
        radius = scan.nextInt();
        Cup cup = new Cup(size, color, radius);
        cup.dishOut();
        System.out.println("Введите размер, цвет, радиус тарелки и укажите, глубокая ли она:");
        size = scan.next();
        color = scan.next();
        radius = scan.nextInt();
        depth = scan.nextBoolean();
        Plate plate = new Plate(size, color, radius, depth);
        plate.dishOut();
    }
}
