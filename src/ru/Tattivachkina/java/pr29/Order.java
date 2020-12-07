package ru.Tattivachkina.java.pr29;

interface Order {
    boolean addPosition(Item a);
    String[] name();
    int count();
    int count(String name);
    Item[] getItems();
    boolean delete(String name);
    int deleteAll(String name);
    Item[] sortedItem();
    int total();
}