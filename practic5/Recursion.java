package ru.mirea.practic5;

import java.util.Scanner;

public class Recursion {
    private boolean flag = false;
    private Scanner scan = new Scanner(System.in);
    private int mountOf1 = 0;

    public Recursion() {
        task17();
        System.out.println("----------------------------------");
        task1(1, 4);
        System.out.println("----------------------------------\n4321");
        task10(4321);
    }

    public void task17() {
        int num = scan.nextInt();
        if (flag && num == 0) {
            System.out.println(mountOf1);
            return;
        }
        else {
            flag = false;
            if (num == 0)
                flag = true;
            if (num == 1)
                mountOf1++;
            task17();
        }
    }

    public void task1(int i, int max) {
        if (i > max) {
            System.out.println();
            return;
        }
        else {
            for (int j = 0; j < i; j++)
                System.out.print(i);
            task1(i + 1, max);
        }
    }

    public void task10(int number) {
        System.out.print(number % 10);
        number /=10;
        if (number == 0)
            return;
        else
            task10(number);
    }

    public static void main(String[] args) {
        new Recursion();
    }
}
