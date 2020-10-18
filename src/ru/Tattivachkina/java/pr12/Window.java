package ru.Tattivachkina.java.pr12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Планета");
        label1.setBounds(250, 10, 320, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel label2 = new JLabel("Притяжение планеты:");
        label2.setBounds(200, 120, 320, 40);
        label2.setFont(new Font("Arial", Font.PLAIN, 20));

        JComboBox comboBox = new JComboBox();
        comboBox.setEditable(true);
        comboBox.addItem("Меркурий");
        comboBox.addItem("Венера");
        comboBox.addItem("Земля");
        comboBox.addItem("Марс");
        comboBox.addItem("Юпитер");
        comboBox.addItem("Сатурн");
        comboBox.addItem("Уран");
        comboBox.addItem("Нептун");
        comboBox.setBounds(150, 50, 320, 40);

        JLabel label3 = new JLabel("4 H/кг");
        label3.setBounds(260, 200, 320, 40);
        label3.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(comboBox);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedIndex() == 0) {
                    label3.setText("4 Н/кг");
                } else if (comboBox.getSelectedIndex() == 1) {
                    label3.setText("9 Н/кг");
                } else if (comboBox.getSelectedIndex() == 2) {
                    label3.setText("10 Н/кг");
                } else if (comboBox.getSelectedIndex() == 3) {
                    label3.setText("4 Н/кг");
                } else if (comboBox.getSelectedIndex() == 4) {
                    label3.setText("25 Н/кг");
                } else if (comboBox.getSelectedIndex() == 5) {
                    label3.setText("9 Н/кг");
                } else if (comboBox.getSelectedIndex() == 6) {
                    label3.setText("9 Н/кг");
                } else if (comboBox.getSelectedIndex() == 7) {
                    label3.setText("11 Н/кг");
                }

            }
        });
    }
}
