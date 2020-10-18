package ru.Tattivachkina.java.pr11.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Шрифт");
        label1.setBounds(70, 10, 320, 20);
        label1.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel label2 = new JLabel("Цвет");
        label2.setBounds(70, 90, 320, 20);
        label2.setFont(new Font("Arial", Font.PLAIN, 14));

        JComboBox comboBox = new JComboBox();
        comboBox.setEditable(true);
        comboBox.addItem("Arial");
        comboBox.addItem("Georgia");
        comboBox.addItem("MS Gothic");
        comboBox.setBounds(70, 40, 320, 40);
        frame.add(comboBox);
        frame.add(label1);
        frame.add(label2);

        JComboBox comboBox2 = new JComboBox();
        comboBox2.setEditable(true);
        comboBox2.addItem("ORANGE");
        comboBox2.addItem("GREEN");
        comboBox2.addItem("RED");
        comboBox2.setBounds(70, 120, 320, 40);
        frame.add(comboBox2);

        JTextArea field = new JTextArea("Текст",2,1);
        field.setFont(new Font("", Font.PLAIN, 14));
        field.setBackground(Color.WHITE);
        field.setForeground(Color.ORANGE);
        field.setFont(new Font("Arial", Font.BOLD, 14));
        field.setBounds(70, 200, 350, 100);

        frame.add(field);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox.getSelectedIndex()==0) {
                    field.setFont(new Font("Arial", Font.BOLD, 14));
                }
                else if (comboBox.getSelectedIndex()==1) {
                    field.setFont(new Font("Georgia", Font.BOLD, 14));
                }
                else if (comboBox.getSelectedIndex()==2) {
                    field.setFont(new Font("MS Gothic", Font.BOLD, 14));
                }
            }
        });
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox2.getSelectedIndex()==0) {
                    field.setForeground(Color.ORANGE);
                }
                else if (comboBox2.getSelectedIndex()==1) {
                    field.setForeground(Color.GREEN);
                }
                else if (comboBox2.getSelectedIndex()==2) {
                    field.setForeground(Color.RED);
                }
            }
        });
    }
}
