package ru.Tattivachkina.java.pr4.ex1;

public class Circle extends Shape {
    double radius;

    public Circle() { }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean isFilled) {
        this.radius = radius;
        super.color = color;
        super.filled = isFilled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
