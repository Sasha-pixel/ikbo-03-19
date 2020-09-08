package ru.mirea.pactic3;

public class movablePoint implements Movable{
    int x, y, xSpeed, ySpeed, x1, x2, y1, y2;

    public movablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public movablePoint(int xSpeed, int ySpeed, int x1, int x2, int y1, int y2) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "movablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }
}
