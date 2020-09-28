package ru.Tattivachkina.java.pr7;

public class Teapot extends Dish {
    private int volume;
    private String material;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Teapot(int volume, String material) {
        this.volume = volume;
        this.material = material;

    }

    @Override
    public String toString() {
        return "Teapot{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    void takeAway() {
    }
}
