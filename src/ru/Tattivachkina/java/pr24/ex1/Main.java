package ru.Tattivachkina.java.pr24.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person human = new Person(scanner.nextLine());
        System.out.println(human.nameReturn());
    }
}
