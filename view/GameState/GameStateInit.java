package view.GameState;

import controller.App;
import view.AppWindow;

public class GameStateInit implements GameState {

    public GameStateInit() {
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
