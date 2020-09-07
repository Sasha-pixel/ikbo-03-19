package ru.mirea.practic2.task2;
import java.util.Scanner;

public class ballTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, xDisp, yDisp;
        System.out.println("Введите начальные координаты мяча");
        x = scan.nextDouble();
        y = scan.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println(ball);
        System.out.println("Введите значения, на которые изменятся координаты мяча");
        xDisp = scan.nextDouble();
        yDisp = scan.nextDouble();
        ball.move(xDisp, yDisp);
        System.out.println(ball);
    }
}
