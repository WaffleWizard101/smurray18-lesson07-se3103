package view.GameState;

import controller.App;
import view.AppWindow;

public class GameStatePaused implements GameState {
    
    public GameStatePaused() {
        App.win.startPauseButton.setText(AppWindow.START_ACTION);
        App.win.restartButton.setEnabled(false);
        App.win.startPauseButton.setEnabled(true);
    }

    public void nextState(AppWindow context) {
        context.setGameState(new GameStatePlaying());
    }
    
    public void animate() {

    }
}
