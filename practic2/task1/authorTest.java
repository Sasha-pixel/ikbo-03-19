package ru.mirea.practic2.task1;
import java.util.Scanner;

public class authorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, email, genderBuf;
        char gender;
        System.out.println("Введите имя, email и пол автора");
        name = scan.next();
        email = scan.next();
        genderBuf = scan.next();
        gender = genderBuf.charAt(0);
        Author author = new Author(name, email, gender);
        System.out.println(author);
        System.out.println("Измените email автора");
        email = scan.next();
        author.setEmail(email);
        System.out.println(author);
    }
}
