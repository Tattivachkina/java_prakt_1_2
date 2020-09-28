package ru.Tattivachkina.java.pr7;

public class Bulldog extends Dog{
    private int age;
    private String color;

    public Bulldog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bulldog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    void walk() {
    }
}
