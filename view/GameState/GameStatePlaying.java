package view.GameState;

import controller.App;
import view.AppWindow;

public class GameStatePlaying implements GameState {

    public GameStatePlaying() {
        App.win.startPauseButton.setText(AppWindow.PAUSE_ACTION);
        App.win.restartButton.setEnabled(false);
        App.win.startPauseButton.setEnabled(true);
    }

    public void nextState(AppWindow context) {
        context.setGameState(new GameStatePaused());
    }
    
    public void animate() {
        App.model.snake.move();
    }
    
}
