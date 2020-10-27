package ru.mirea.prac10.task1;

public class ConcreteFactory implements ComplexAbstractFactory {
    public ConcreteFactory() {}

    public Complex createComplex() {
        return new Complex(0, 0);
    }

    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
