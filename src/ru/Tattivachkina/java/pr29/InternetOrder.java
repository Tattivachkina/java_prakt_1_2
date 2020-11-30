package ru.Tattivachkina.java.pr29;

public class InternetOrder<Item> {
    Item info;
    InternetOrder<Item> next;
    InternetOrder<Item> last;

    InternetOrder(Item info) {
        this.info=info;
        this.next = null;
        this.last = null;
    }

    public InternetOrder(Item info, InternetOrder<Item> next, InternetOrder<Item> last) {
        this.info = info;
        this.next = next;
        this.last = last;
    }
}
