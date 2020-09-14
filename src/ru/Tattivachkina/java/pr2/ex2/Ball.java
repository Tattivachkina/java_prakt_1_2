package ru.Tattivachkina.java.pr2.ex2;

public class Ball {
    private int volume;
    private String color;

    public Ball(int volume, String color) {
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }
}
