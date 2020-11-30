package ru.Tattivachkina.java.pr28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("anna123", "anna@gmail.com");
        DATA_BASE.put("qwerty", "john@mail.com");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.print("Введите email пользователя: ");
                email = READER.readLine();
                System.out.print("Введите пароль: ");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Проверка данных прошла успешно.");
                } else {
                    System.out.println("Неверный email или пароль!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Оплата " + paymentAmount + " руб. с помощью электронного кошелька.");
            return true;
        } else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
