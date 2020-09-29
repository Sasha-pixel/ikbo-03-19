package ru.mirea.practic7;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GameOnQueue extends Drunkard{
    private Queue<Integer> player1Queue;
    private Queue<Integer> player2Queue;

    @Override
    public void playersCardsInput() {
        super.playersCardsInput();
        /*for (int i = 0;i < 5;i++) {
            player1Queue.add(player1.get(i));
            player2Queue.add(player2.get(i));
        }*/
        player1Queue = new LinkedList<>();
        player2Queue = new LinkedList<>();
        player1Queue.addAll(player1);
        player2Queue.addAll(player2);
        player1.clear();
        player2.clear();
    }

    @Override
    public void ifCardsAreEquals() {
        /*player1.add(player1Queue.poll());
        player1.addAll(0,player1Queue);
        player1Queue.clear();
        player1Queue.addAll(player1);
        player1.clear();

        player2.add(player2Queue.poll());
        player2.addAll(0,player2Queue);
        player2Queue.clear();
        player2Queue.addAll(player2);
        player2.clear();*/

        player1Queue.add(player2Queue.poll());
        player1Queue.add(player1Queue.poll());
        player2Queue.add(player1Queue.poll());
        player2Queue.add(player2Queue.poll());
    }

    @Override
    public void repushToPlayer1Deck() {
        /*player1.add(player1Queue.poll());
        player1.add(player2Queue.poll());
        player1.addAll(0,player1Queue);
        player1Queue.clear();
        player1Queue.addAll(player1);
        player1.clear();*/
        player1Queue.add(player1Queue.poll());
        player1Queue.add(player2Queue.poll());
    }

    @Override
    public void repushToPlayer2Deck() {
        /*player2.add(player2Queue.poll());
        player2.add(player1Queue.poll());
        player2.addAll(0,player2Queue);
        player2Queue.clear();
        player2Queue.addAll(player2);
        player2.clear();*/
        player2Queue.add(player2Queue.poll());
        player2Queue.add(player1Queue.poll());
    }

    @Override
    public int checkPlayer1Size() {
        return player1Queue.size();
    }

    @Override
    public int checkPlayer2Size() {
        return player2Queue.size();
    }

    @Override
    public int checkPlayer1Card() {
        return player1Queue.peek();
    }

    @Override
    public int checkPlayer2Card() {
        return player2Queue.peek();
    }

    public GameOnQueue() {
        Game();
    }

    //6 0 1 4 2
    //9 8 1 2 0
    //Первый игрок победил!
    public static void main(String[] args) {
        new GameOnQueue();
    }
}
