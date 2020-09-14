package ru.Tattivachkina.java.pr1.ex1;

public class Main {

    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println("Hi");
        int[] array = {2, 4, 6, 11, 1};
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s = s + array[i];
        }
        System.out.println(s);
        int i =0;
        int s1=0;
        while(i<5){
            s1+=array[i];
            i++;
        }
        System.out.println(s1);
        int j =0;
        int s2=0;
        do {
            s2+=array[j];
            j++;
        }
            while(j<5);
        System.out.println(s2);
        }

    }
