package ru.mirea.lab5;

import java.awt.*;

public class Circle extends Shape {

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y, radius, radius);
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }
}
