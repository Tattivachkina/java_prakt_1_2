package ru.Tattivachkina.java.pr29;


public class RestaurantOrder implements Order {
    private Item[] items;

    public RestaurantOrder(Item[] items) {
        this.items = items;
    }

    @Override
    public int count() {
        return items.length;
    }

    @Override
    public int count(String name) {
        int count = 0;
        for (Item item: items) {
            if (item.getName().equals(name)) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public int total() {
        int total = 0;
        for (Item item : items) {
            total += item.getCost();
        }
        return total;
    }

    @Override
    public boolean addPosition(Item a) {
        return false;
    }

    @Override
    public String[] name() {
        return new String[0];
    }

    @Override
    public boolean delete(String name) {
        return false;
    }

    @Override
    public int deleteAll(String name) {
        return 0;
    }

    @Override
    public Item[] sortedItem() {
        return new Item[0];
    }
}