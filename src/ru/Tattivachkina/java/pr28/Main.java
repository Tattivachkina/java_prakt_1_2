package ru.Tattivachkina.java.pr28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 40 );
        priceOnProducts.put(2, 45);
        priceOnProducts.put(3, 30);
        priceOnProducts.put(4, 70);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Выберите товар:" + "\n" +
                        "1 - Апельсин" + "\n" +
                        "2 - Мандарин" + "\n" +
                        "3 - Яблоко" + "\n" +
                        "4 - Аводкадо" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Количество: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Вы желаете продолжить? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Выберите способ оплаты:" + "\n" +
                        "1 - Электронный кошелёк" + "\n" +
                        "2 - Кредитная карта");
                String paymentMethod = reader.readLine();


                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            order.processOrder(strategy);

            System.out.print("Оплатить " + order.getTotalCost() + " рублей или продолжить покупки? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Оплата прошла успешно");
                } else {
                    System.out.println("Ошибка, проверьте данные!");
                }
                order.setClosed();
            }
        }
    }
}
