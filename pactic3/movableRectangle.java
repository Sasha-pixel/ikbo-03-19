package ru.mirea.pactic3;

public class movableRectangle extends movablePoint{
    private movablePoint topLeft, bottomRight;

    public movableRectangle(int xSpeed, int ySpeed, int x1, int x2, int y1, int y2, movablePoint topLeft, movablePoint bottomRight) {
        super(xSpeed, ySpeed, x1, x2, y1, y2);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean chekSpeed() {
        if (xSpeed == ySpeed)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "movableRectangle{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
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
