package ru.mirea.lab2;

public class Human {
    private Head head;
    private Hand hand;
    private Leg leg;

    public Human(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public void humanOut() {
        System.out.print("Размеры голов, рук и ног вашего человека соответственно: " + head.getSize() + ", " + hand.getlength() + ", " + leg.getlength());
    }
}
