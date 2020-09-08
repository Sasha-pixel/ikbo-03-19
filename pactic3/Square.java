package ru.mirea.pactic3;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square(Double side, String color, boolean filled) {
        super(color, filled);
        this.width=side;
    }

    public double getSide() {
        return width;
    }

    public void getSide(double side) {
        this.width = side;
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }
}
