package ru.mirea.lab3.task3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цену, цвет и материал стола:");
        int cost;
        String color, material, type;
        cost = scan.nextInt();
        color = scan.next();
        material = scan.next();
        Table table1 = new Table(cost, color, material, "table");
        System.out.println("Введите цену, цвет и материал второго стола:");
        cost = scan.nextInt();
        color = scan.next();
        material = scan.next();
        Table table2 = new Table(cost, color, material, "table");
        System.out.println("Введите цену, цвет и материал дивана:");
        cost = scan.nextInt();
        color = scan.next();
        material = scan.next();
        Sofa sofa = new Sofa(cost, color, material, "sofa");

        furnitureShop shop = new furnitureShop();//тестируем магазин
        shop.addObj(table1);
        shop.addObj(table2);
        shop.addObj(sofa);
        System.out.println("Вывод данных о всех товарах");
        shop.outAllElements();
        System.out.println("Вывод данных о втором столе");
        shop.outElement(table2);
        System.out.println("Теперь удалим данные о втором стое:");
        shop.removeObj(table2);
        System.out.println("Вывод данных о всех товарах");
        shop.outAllElements();
    }
}
