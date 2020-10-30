package ru.Tattivachkina.java.pr15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("day 1");
        arrayList.add("day 2");
        arrayList.add("day 3");
        arrayList.add("day 4");
        arrayList.add("day 5");

        for (String l : arrayList) {
            System.out.print(l + " ");
        }
        System.out.println();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");
        linkedList.add("fifth");

        for (String ls : linkedList) {
            System.out.print(ls + " ");
        }
        List<Integer> myArrayList = new List<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);

        System.out.println();
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
    }
}
