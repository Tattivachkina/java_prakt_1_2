package ru.Tattivachkina.java.pr7;

public class Husky extends Dog {
    private int age;
    private String name;

    public Husky(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    void walk() {
    }
}
