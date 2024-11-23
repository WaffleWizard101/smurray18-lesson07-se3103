package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.observerPattern.SnakeEvent;
import view.GameState.GameState;
import view.GameState.GameStatePlaying;

public class TimerListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        GameState state = App.win.getGameState();
        state.animate();
        if(state instanceof GameStatePlaying) {
            detectCollision();
        }
        App.win.getCanvas().repaint();

    }

    private void detectCollision() {
        //Snake gets food
        if (App.model.snakeGotFood()) {
            App.model.snake.notifyObservers(SnakeEvent.HIT_FOOD);
        }
        //Snake left the screen
        if (App.model.snakeHitWall()) {
            App.model.snake.notifyObservers(SnakeEvent.HIT_WALL);
        }

        //Hit self
        if(App.model.snakeHitSelf()) {
            App.model.snake.notifyObservers(SnakeEvent.HIT_SELF);
        }
    }
    
}
