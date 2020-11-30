package ru.Tattivachkina.java.pr28;

interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
