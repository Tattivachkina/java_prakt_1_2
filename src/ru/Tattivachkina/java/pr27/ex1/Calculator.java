package ru.Tattivachkina.java.pr27.ex1;

import java.util.Scanner;

public class Calculator {
    private Operations opr;

    public Calculator(Operations opr) {
        this.opr = opr;
        this.input();
    }

    public void input() {
        int a, b = 0;
        char action;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                a = scanner.nextInt();
                b = scanner.nextInt();
                action = scanner.next().charAt(0);
                opr.addNum(a, b, action);
                System.out.println(opr.getResult());
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}

