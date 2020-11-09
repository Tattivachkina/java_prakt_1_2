package ru.Tattivachkina.java.pr21.ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Functional  extends JFrame {
    public Functional(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        setJMenuBar(menuBar);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
    }
    public JMenu createFileMenu(){
        JMenu file = new JMenu("Файл");
        JMenu newFile = new JMenu("Новый");
        JMenuItem open = new JMenuItem("Открыть");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");
        JMenuItem textDocument = new JMenuItem("TextDocument");
        JMenuItem imgdoс = new JMenuItem("ImageDocument");
        JMenuItem musdoc = new JMenuItem("MusicDocument");
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);
        newFile.add(textDocument);
        newFile.add(imgdoс);
        newFile.add(musdoc);
        textDocument.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали textDocument");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateNew();
                System.out.println("Файл создан");
            }
        });
        imgdoс.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали ImgDoc");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Создан файл");
            }
        });
        musdoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали MusDoc");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Создан файл");
            }
        });
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали Open");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Открыт файл");
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали Save");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Сохранить файл");
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажали Exit");
                ICreateDocument iCreateDocument = new ICreateDocument();
                iCreateDocument.CreateOpen();
                System.out.println("Выход из файла");
            }
        });
        return file;
    }
}
