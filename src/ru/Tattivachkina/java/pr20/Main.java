package ru.Tattivachkina.java.pr20;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Conversion<Integer> listInt = new Conversion(numbers);
        listInt.showList();

        String[] lines = {"w", "h", "a", "t","s", "u","p"};
        Conversion<String> listStr = new Conversion(lines);
        listStr.show();
    }
}
