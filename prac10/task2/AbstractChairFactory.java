package ru.mirea.prac10.task2;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();

    public MagicChair createMagicChair();

    public FunctionalChair createFunctionalChair();
}
