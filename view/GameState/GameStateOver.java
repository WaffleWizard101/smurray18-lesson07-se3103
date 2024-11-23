package view.GameState;

import controller.App;
import view.AppWindow;

public class GameStateOver implements GameState {

    public GameStateOver() {
        App.win.restartButton.setEnabled(true);
        App.win.startPauseButton.setEnabled(false);
    }

    public void nextState(AppWindow context) {
        context.setGameState(new GameStateInit());
    }
    
    public void animate() {
        //snake falling effect
    }
    
}
