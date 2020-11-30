package ru.Tattivachkina.java.pr29;

import java.util.HashMap;

interface Order {
    boolean addPosition(Item a);

    boolean addPosition(Item a, HashMap<String, Order> hashMap);

    boolean addPosition(HashMap<String, Order> hashMap);

    int delete(Item a);

    int delete(Item a, HashMap<String, Order> hashMap);

    int count();

    Item getCounts(HashMap<String, Order> hashMap);

    Item arrayCounts();

    Item arrayCountsSorted();

    int cost();

    int totalOrder(String name);

    int total(Item a);

    Item arrayCountsNames();
}