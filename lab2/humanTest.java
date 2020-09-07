package ru.mirea.lab2;
import java.util.Scanner;

public class humanTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры(длину) головы, рук, ног соответственно:");
        int headSize, handLength, legLength;
        headSize = scan.nextInt();
        handLength = scan.nextInt();
        legLength = scan.nextInt();
        Head head = new Head(headSize);
        Hand hand = new Hand(handLength);
        Leg leg = new Leg(legLength);
        Human human = new Human(head, hand, leg);
        human.humanOut();
    }
}
