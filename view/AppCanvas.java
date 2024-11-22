package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import controller.App;
import model.Food;
import model.Snake;

public class AppCanvas extends JPanel {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    public AppCanvas() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        drawScore(g2, App.model.score);
        drawSnake(g2, App.model.snake);
        if(App.model.food != null) {
            drawFood(g2, App.model.food);
        }
        if(App.model.messages != null) {
            drawMessages(g2, App.model.messages);
        }
    }

    void drawScore(Graphics2D g2, int score) {

    }

    void drawSnake(Graphics2D g2, Snake snake) {

    }

    void drawFood(Graphics2D g2, Food food) {

    }

    void drawMessages(Graphics2D g2, String messages) {

    }
}