package ru.Tattivachkina.java.pr7;

public class Sofa extends Furniture {
    private String color;
    private int price;

    public Sofa(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    void buy() {
    }
}
