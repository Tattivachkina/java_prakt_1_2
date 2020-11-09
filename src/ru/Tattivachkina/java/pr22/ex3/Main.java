package ru.Tattivachkina.java.pr22.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Введите имя");
        String secondName = scanner.nextLine();
        student.setStart();
        student.setFinish();
    }
}
