package ru.Tattivachkina.java.pr22.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в виде <Число><Месяц><Год>");
        Date date = new Date(scanner.nextLine());
        System.out.println(date.toString());
        System.out.println("Введите время виде <Часы><Минуты>");
        Calendar calendar = new Calendar(scanner.nextLine());
        System.out.println(calendar.toString());
    }
}
