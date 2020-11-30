package ru.Tattivachkina.java.pr30;

interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
