package ru.Tattivachkina.java.pr32;

public class TableOrder implements Order {
    private int size;
    MenuItem[] items;

    @Override
    public boolean add(MenuItem item) {
        return false;
    }

    @Override
    public String[] itemsNames() {
        return new String[0];
    }

    @Override
    public int itemsQuantity() {
        return 0;
    }

    @Override
    public int itemQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return 0;
    }

    @Override
    public MenuItem[] getItems() {
        return new MenuItem[0];
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return 0;
    }

    @Override
    public MenuItem[] sortedItemByCostDesc() {
        return new MenuItem[0];
    }

    @Override
    public int costTotal() {
        return 0;
    }

    @Override
    public Customer getCustomer() {
        return null;
    }

    @Override
    public void setCustomer(Customer customer) {

    }
}
