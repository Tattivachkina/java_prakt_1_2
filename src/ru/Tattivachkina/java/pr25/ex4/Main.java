package ru.Tattivachkina.java.pr25.ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String a = input;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matchers = pattern.matcher(input);
        do {
            input = matchers.replaceAll("");
            matchers = pattern.matcher(input);
        } while (matchers.find());
        if (input.matches("[\\d+/*-]*")) {
            System.out.println(a);
        }
    }
}
