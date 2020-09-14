package ru.Tattivachkina.java.pr1.ex4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] array=new int [5];
        Random rand= new Random();
        for (int i = 0; i <5 ; i++) {
            array[i]= rand.nextInt(100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+ " ");
        }
        int k=0;
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<4; j++){
          if(array[j]>array[j+1]) {
              k = array[j];
              array[j] = array[j + 1];
              array[j + 1] = k;
          }
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        int [] arr=new int [5];
        for (int i = 0; i < 5; i++){
            arr[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+ " ");
        }
        int k2=0;
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<4; j++){
                if(arr[j]>arr[j+1]) {
                    k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
