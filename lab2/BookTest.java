package ru.mirea.lab2;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фамилию автора, название, жанр и год издания книги");
        String author = scan.nextLine();
        String name = scan.nextLine();
        String genre = scan.nextLine();
        int year = scan.nextInt();
        Book book = new Book(author, name, genre, year);
        System.out.println(book);
        System.out.println("Теперь введите фамилию автора, название, жанр и год издания другой книги");
        author = scan.next();
        book.setAuthor(author);
        name = scan.next();
        book.setName(name);
        genre = scan.next();
        book.setGenre(genre);
        year = scan.nextInt();
        book.setYear(year);
        System.out.println(book);
    }
}
