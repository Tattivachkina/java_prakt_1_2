package ru.Tattivachkina.java.pr29;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> map = new HashMap<>();

    public void addOrder(String address, Order order) throws Exception {
        if (map.containsKey(address)) {
            throw new OrderAlreadyAddedException();
        }
        map.put(address, order);
    }

    public Order getOrder(String address) {
        return map.get(address);
    }

    public void deleteOrder(String address) {
        map.remove(address);
    }

    public void addToOrder(String address, Item a) {
        map.get(address).addPosition(a);
    }

    public Order[] getOrdersArray() {
        return map.values().toArray(new Order[0]);
    }

    public int getTotal() {
        int total = 0;
        for (Order order : map.values()) {
            total += order.total();
        }
        return total;
    }

    public int itemsQuantity(String name) {
        int count = 0;
        for (Order order : map.values()) {
            count += order.count(name);
        }
        return count;
    }
}
