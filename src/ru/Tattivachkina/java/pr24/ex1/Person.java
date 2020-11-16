package ru.Tattivachkina.java.pr24.ex1;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String nameReturn() {
        try {
            String[] str = name.split(" ");
            char[] chars = str[1].toCharArray();
            char[] chars1 = str[2].toCharArray();
            return str[0] + " " + chars[0] + "." + chars1[0] + ".";
        } catch (Exception e) {
            return "Ошибка ввода данных";
        }
    }
}
