package ru.Tattivachkina.java.pr24.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите +<Код страны><Номер 10 цифр> или 8<Номер 10 цифр>");
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone(scanner.nextLine());
        phone.Return();
        System.out.println(phone.toString());
    }
}
