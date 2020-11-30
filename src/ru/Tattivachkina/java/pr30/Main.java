package ru.Tattivachkina.java.pr30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цену, название и описание");
        Scanner in = new Scanner(System.in);
        int cost = in.nextInt();
        String name = in.next();
        String description = in.next();
        MenuItem menuItem = new MenuItem(cost, name, description);
        System.out.println(menuItem.toString());
    }
}
