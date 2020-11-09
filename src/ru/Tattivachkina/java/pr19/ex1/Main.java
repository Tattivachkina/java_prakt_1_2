package ru.Tattivachkina.java.pr19.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fio, inn;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        fio = scanner.nextLine();
        System.out.println("Введите ИНН: ");
        inn = scanner.nextLine();
        char a = inn.charAt(0);
        try {
            if (inn.length() < 12 || inn.length() > 12 || a == '0') {
                throw (new Exception());
            }
            System.out.println("ИНН верное");
        }
        catch (Exception ex){
            System.out.println("Неверное ИНН");
        }
    }
}
