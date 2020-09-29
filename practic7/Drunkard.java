package ru.mirea.practic7;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Drunkard {
    ArrayList<Integer> player1 = new ArrayList<Integer>();
    ArrayList<Integer> player2 = new ArrayList<Integer>();
    int amountOfSteps = 0;

    public void playersCardsInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номиналы пяти карт первого игрока:");
        for (int i = 0;i < 5;i++)
            player1.add(scanner.nextInt());
        System.out.print("Введите номиналы пяти карт второго игрока:");
        for (int i = 0;i < 5;i++)
            player2.add(scanner.nextInt());
    }

    public abstract void ifCardsAreEquals();
    public abstract void repushToPlayer1Deck();
    public abstract void repushToPlayer2Deck();
    public abstract int checkPlayer1Size();
    public abstract int checkPlayer2Size();
    public abstract int checkPlayer1Card();
    public abstract int checkPlayer2Card();

    public void Game() {
        playersCardsInput();
        System.out.println("Игра началась!");
        while (amountOfSteps <= 106 && checkPlayer1Size() != 0 && checkPlayer2Size() != 0) {
            amountOfSteps++;
            if (checkPlayer1Card() == 0)
                repushToPlayer1Deck();
            else if (checkPlayer2Card() == 0)
                repushToPlayer2Deck();
            else if (checkPlayer1Card() > checkPlayer2Card())
                repushToPlayer1Deck();
            else if (checkPlayer2Card() > checkPlayer1Card())
                repushToPlayer2Deck();
            else if (checkPlayer1Card() == checkPlayer2Card())
                ifCardsAreEquals();
        }
        if (amountOfSteps == 107)
            System.out.println("Ботва!");
        else if (checkPlayer1Size() == 0)
            System.out.println("Второй игрок победил!");
        else if (checkPlayer2Size() == 0)
            System.out.println("Первый игрок победил!");
    }
}
