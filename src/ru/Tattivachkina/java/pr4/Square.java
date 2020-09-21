package ru.Tattivachkina.java.pr4;

public class Square extends Rectangle {
    double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.side = side;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
