package ru.Tattivachkina.java.pr3.ex1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double calculArea(){
        return (Math.PI*radius*radius);
    }
}
