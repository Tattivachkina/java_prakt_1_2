package ru.Tattivachkina.java.pr6;

public class MovableRectangle extends Rectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1,int y2, int xSpeed, int ySpeed) {
        topLeft.x= x1;
        bottomRight.x=x2;
        topLeft.y = y1;
        bottomRight.y=y2;
        topLeft.xSpeed=xSpeed;
        topLeft.ySpeed=ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }

    public MovableRectangle(double width, double length) {

        super(width, length);
    }

    public boolean check(){
        if ((topLeft.ySpeed == bottomRight.ySpeed)&& (topLeft.xSpeed == bottomRight.xSpeed))
            return true;
        else return false;
    }

    public void moveUp() {
    }
    public void moveDown() {
    }
    public void moveLeft() {
    }
    public void moveRight() {
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
