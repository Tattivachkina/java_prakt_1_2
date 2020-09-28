package ru.Tattivachkina.java.pr7;

public class Plate extends Dish{
    private int square;
    private String color;

    public Plate(int square, String color) {
        this.square = square;
        this.color = color;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "square=" + square +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    void takeAway() {
    }
}
