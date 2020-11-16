package ru.Tattivachkina.java.pr25.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$";
        String newIP = scanner.nextLine();
        if (newIP.matches(regex)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
