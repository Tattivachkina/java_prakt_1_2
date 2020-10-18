package ru.Tattivachkina.java.pr11.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window extends JFrame {
    public int k = 0;
    public int b = 0;

    Window() {
        super("Game");
        Random random = new Random();
        int numb = random.nextInt(20);
        JButton check = new JButton("Проверка значения");
        JButton exit = new JButton("Закрыть");
        JTextField field0 = new JTextField("Введите значение", 15);
        JTextField field = new JTextField("", 20);
        field0.setFont(new Font("Arial", Font.PLAIN, 16));
        field0.setHorizontalAlignment(JTextField.CENTER);
        field0.setBounds(85, 50, 350, 40);
        field.setFont(new Font("Arial", Font.PLAIN, 16));
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBounds(85, 100, 350, 40);
        check.setBounds(85, 160, 350, 40);
        exit.setBounds(85, 290, 350, 40);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        exit.setVisible(false);
        add(field0);
        add(check);
        add(field);
        add(exit);
        add(field0);
        JTextField field1 = new JTextField("Результат", 10);
        field1.setHorizontalAlignment(JTextField.CENTER);
        field1.setFont(new Font("Dialog", Font.PLAIN, 16));
        field1.setBounds(85, 230, 350, 30);
        add(field1);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(field.getText());
                if (n > numb) {
                    field1.setText("Загаданное число меньше");
                } else if (n < numb) {
                    field1.setText("Загаданное число больше");
                } else {
                    field1.setText("Вы угадали");
                    exit.setVisible(true);
                    check.setVisible(false);
                    b++;
                }
                k++;
                if ((k == 3) && (b == 0)) {
                    field1.setText("Вы проиграли, т.к.\nистратили все попытки");
                    field1.setBounds(45, 230, 400, 60);
                    check.setVisible(false);
                    exit.setVisible(true);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        check.addActionListener(actionListener);
        exit.addActionListener(actionListener2);
    }
}
