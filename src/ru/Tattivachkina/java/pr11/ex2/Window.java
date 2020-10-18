package ru.Tattivachkina.java.pr11.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        JFrame panel = new JFrame();
        JButton but = new JButton("Centre");
        JButton but2 = new JButton("North");
        JButton but3 = new JButton("South");
        JButton but4 = new JButton("West");
        JButton but5 = new JButton("East");
        but.setBounds(250, 250, 200, 200);
        but2.setBounds(100, 50, 500, 200);
        but3.setBounds(100, 450, 500, 200);
        but4.setBounds(100, 250, 150, 200);
        but5.setBounds(450, 250, 150, 200);
        panel.add(but);
        panel.add(but2);
        panel.add(but3);
        panel.add(but4);
        panel.add(but5);
        panel.setSize(700, 700);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЦАО");
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в CАО");
            }
        };
        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЮЗАО");
            }
        };
        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в ЗАО");
            }
        };
        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в СВАО");
            }
        };
        but.addActionListener(actionListener);
        but2.addActionListener(actionListener2);
        but3.addActionListener(actionListener3);
        but4.addActionListener(actionListener4);
        but5.addActionListener(actionListener5);
    }
}
