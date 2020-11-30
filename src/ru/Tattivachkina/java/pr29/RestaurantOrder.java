package ru.Tattivachkina.java.pr29;

import java.util.HashMap;

public class RestaurantOrder implements Order {
    private InternetOrder<Item> position;
    private int count;
    HashMap<String, Order> hashtable = new HashMap<String, Order>();

    public RestaurantOrder() {
        position = null;
    }

    @Override
    public boolean addPosition(Item a) {
        return false;
    }

    @Override
    public boolean addPosition(Item a, HashMap<String, Order> hashMap) {
        return false;
    }

    @Override
    public boolean addPosition(HashMap<String, Order> hashMap) {
        return false;
    }

    @Override
    public int delete(Item a) {
        return 0;
    }

    @Override
    public int delete(Item a, HashMap<String, Order> hashMap) {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Item getCounts(HashMap<String, Order> hashMap) {
        return null;
    }

    @Override
    public Item arrayCounts() {
        return null;
    }

    @Override
    public Item arrayCountsSorted() {
        return null;
    }

    @Override
    public int cost() {
        return 0;
    }

    @Override
    public int totalOrder(String name) {
        return 0;
    }

    @Override
    public int total(Item a) {
        return 0;
    }

    @Override
    public Item arrayCountsNames() {
        return null;
    }
}
