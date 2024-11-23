package model;

import java.util.Random;

import controller.App;
import view.AppCanvas;
import view.AppWindow;

public class GameModel {

    public Snake snake;
    public Food food;
    public String messages;
    public int score;

    public GameModel() {
        snake = new Snake();
        init();
    }
    
    public void init() {
        score = 0;
        messages = "Click <Start> to play!";
        food = createFood();
        snake.init();
    }

    public Food createFood() {
        Random random = new Random();
        int x, y;
        x = random.nextInt(AppCanvas.WIDTH / AppWindow.GRID_SIZE)
                * AppWindow.GRID_SIZE;
        y = random.nextInt(AppCanvas.HEIGHT / AppWindow.GRID_SIZE)
                * AppWindow.GRID_SIZE;
        return new Food(x, y);
    }

    public boolean snakeGotFood() {
        var food = App.model.food;
        var head = App.model.snake.nodes.get(0);
        return food.x == head.x && food.y == head.y;
    }

    public boolean snakeHitWall() {
        var head = App.model.snake.nodes.get(0);
        return head.x < 0 || head.x >= AppCanvas.WIDTH
            || head.y < 0 || head.y >= AppCanvas.HEIGHT;
    }

    public boolean snakeHitSelf() {
        var nodes = App.model.snake.nodes;
        var head = nodes.get(0);

        for(int i = 1; i < nodes.size(); i++) {
            var bodyPart = nodes.get(i);
            if(head.x == bodyPart.x && head.y == bodyPart.y)
                return true;
        }
        return false;
    }
}
