package ru.Tattivachkina.java.pr7;

public class Table extends Furniture {
    private int price;
    private  String color;

    public Table(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    void buy() {

    }
}
