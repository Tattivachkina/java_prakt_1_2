package ru.Tattivachkina.java.pr9;

import java.awt.*;

abstract class Shape {
    protected String color;
    protected boolean filled;
    protected int centerX;
    protected int centerY;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {

    }

    String getColor() {

        return color;
    }

    void setColor(String color) {

        this.color = color;
    }

    Boolean isFilled() {
        return filled;
    }

    void setFilled(Boolean isFilled) {

        filled = isFilled;
    }


    public void generateXY(int x, int y) {
        centerX = x;
        centerY = y;
    }
    public abstract void draw(Graphics2D abc);
}
