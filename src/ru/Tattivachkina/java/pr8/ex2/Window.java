package ru.Tattivachkina.java.pr8.ex2;

import javax.imageio.ImageIO;
import java.io.File;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
public class Window extends JFrame {

    Image image;
    String abc;

    Window(String abc) {
        this.abc = abc;
        try {
            image = ImageIO.read(new File(abc));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(0, 0, image.getHeight(null), image.getWidth(null));
        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {

        if (image != null) {
            g.drawImage(image, 0, 0, null);
        }
    }
}
