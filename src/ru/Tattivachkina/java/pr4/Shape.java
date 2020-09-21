package ru.Tattivachkina.java.pr4;

abstract class Shape
{
    String color;
    Boolean filled;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() { }

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

    abstract double getArea();
    abstract double getPerimeter();
}
