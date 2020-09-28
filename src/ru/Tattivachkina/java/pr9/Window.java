package ru.Tattivachkina.java.pr9;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame{
    JButton btn;

    Window(){
        super("Pr9");
        btn= new JButton("Buttom");
        setBounds(100,100,900,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(btn);
        btn.addMouseListener(new MyMouse(this));
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d= (Graphics2D) g;
        for (int i=0, z=0; i<20; i++, z=((int)(Math.random()*10))%2){
            Random rand= new Random();
            gr2d.setColor( new Color(Math.abs(rand.nextInt())));
            switch (z) {
                case 0:
                    drawShape(new Circle(Math.random()*100,Math.abs(rand.nextInt())%500+50,Math.abs(rand.nextInt())%500+50),gr2d);
                    break;
                case 1:
                    drawShape(new Rectangle(Math.random()*100,Math.random()*100, Math.abs(rand.nextInt())%500+50,Math.abs(rand.nextInt())%500+50),gr2d);
                    break;

            }
        }
    }

    private void drawShape(Shape a, Graphics2D gr2d) {
        a.draw(gr2d);
    }
}
