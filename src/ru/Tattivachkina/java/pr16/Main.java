package ru.Tattivachkina.java.pr16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            arr2.add(scanner.nextInt());
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
             if ((arr1.size() != 0) && (arr2.size() != 0)) {
                if (((arr1.get(0) == 9) && (arr2.get(0) == 0))||(arr1.get(0) < arr2.get(0))) {
                    arr2.add(arr1.get(0));
                    arr2.add(arr2.get(0));
                }
                else if (((arr1.get(0) == 0) && (arr2.get(0) == 9))||(arr1.get(0) > arr2.get(0))) {
                    arr1.add(arr1.get(0));
                    arr1.add(arr2.get(0));
                }
                 arr1.remove(0);
                 arr2.remove(0);
             }
            else if (arr1.size() == 0) {
                System.out.println("Second "+i);
                 res = true;
                break;
            }
            else if (arr2.size() == 0) {
                System.out.println("First "+i);
                 res = true;
                break;
            }
            count++;
        }
        if ((count == 106) || (res==false)) System.out.println("Botva");
    }
}
