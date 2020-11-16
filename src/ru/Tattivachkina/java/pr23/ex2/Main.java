package ru.Tattivachkina.java.pr23.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Санкт-Петербуг");
        arrayList.add("Казань");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Бостон");
        arrayList1.add("Нью-Йорк");
        map.put("Россия", arrayList);
        map.put("Соединенные штаты Америки",arrayList1);
        System.out.println(map.get("Россия"));
    }
}
