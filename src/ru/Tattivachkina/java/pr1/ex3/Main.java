package ru.Tattivachkina.java.pr1.ex3;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            double var=1.0/i;
            String message=String.format("%.2f",var);
            System.out.println(message);
        }
    }
}
