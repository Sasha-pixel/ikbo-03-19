package ru.mirea.lab2;

public class Circle {
    private double P = 3.14;
    private int Radius, Diameter;
    private String circumference;

    public Circle(int radius) {
        Radius = radius;
        Diameter = Radius*2;
        circumference = String.format("%.2f", 2 * P * Radius);
    }

    public void changeRadius(int Radius) {
        this.Radius = Radius;
        this.Diameter = this.Radius*2;
        this.circumference = String.format("%.2f", 2 * P * this.Radius);
    }

    public int getRadius() {
        return Radius;
    }

    public int getDiameter() {
        return Diameter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                ", Diameter=" + Diameter +
                ", circumference=" + circumference +
                '}';
    }
}
