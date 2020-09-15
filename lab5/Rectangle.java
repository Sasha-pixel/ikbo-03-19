package ru.mirea.lab5;

import java.awt.*;

public class Rectangle extends Shape{

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.fillRect(getX(), getY(), getWidth(),getHeight());
    }
}