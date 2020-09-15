package ru.mirea.lab5;

import java.awt.*;

public class Oval extends Shape {

    public Oval(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval(getX(), getY(), getWidth(),getHeight());
    }
}
