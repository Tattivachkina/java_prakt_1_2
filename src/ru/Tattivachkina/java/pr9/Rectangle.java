package ru.Tattivachkina.java.pr9;

import java.awt.*;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width,double length,double centerX, double centerY){
        super.generateXY((int)centerX,(int)centerY);
        this.width=width;
        this.length=length;
    }

    @Override
    public void draw(Graphics2D abc) {
        abc.drawRect(centerX,centerY,(int)width,(int)length);
    }
}
