package ru.Tattivachkina.java.pr27.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class GameController implements KeyListener, ActionListener {
    private GameView renderer;
    private Timer mainTimer;
    private Snake snake;

    public GameController() {
        snake = new Snake();
        renderer = new GameView(this);

        this.renderer.addKeyListener(this);
        this.mainTimer = new Timer(150, this);

        mainTimer.start();
    }

    public void stopGame() {
        mainTimer.stop();
    }

    public void startGame() {
        mainTimer.start();
    }


    public void keyPressed(KeyEvent e) {
        snake.onMove(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void actionPerformed(ActionEvent arg0) {
        renderer.moveForward();
    }

    public Snake getSnake() {
        return snake;
    }
}
