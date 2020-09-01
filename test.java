package ru.mirea.practic1;
import java.util.Scanner;

public class test {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите имя, возраст и цвест собаки:\n");
        String name, color, type;
        int age;
        name = scan.next();
        age = scan.nextInt();
        color = scan.next();
        dog dogy = new dog();
        dogy.set(name, age, color);
        System.out.println(dogy);

        System.out.print("Введите тип и цвет мяча:\n");
        type = scan.next();
        color = scan.next();
        ball obj = new ball();
        obj.set(type, color);
        System.out.println(obj);

        System.out.print("Введите жанр книги:\n");
        type = scan.next();
        book paper = new book();
        paper.set(type);
        System.out.println(paper);
    }
}
