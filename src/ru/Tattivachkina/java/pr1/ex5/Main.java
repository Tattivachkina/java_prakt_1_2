package ru.Tattivachkina.java.pr1.ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println(Method(5));
    }
    public static int Method(int b){
        int a=1;
        for (int i = 1; i <= b; i++) {
            a = i*a;
        }
        return a;
        }
    }
