package ru.Tattivachkina.java.pr29;

import java.util.HashMap;

public class OrderManager<Item> {
    private InternetOrder<Item> position;
    private int count;
    HashMap<String, Order> hashtable = new HashMap<String, Order>();

    public OrderManager() {
        position = null;
    }



}
