package view.GameState;

import view.AppWindow;

public class GameStatePlaying implements GameState {

    AppWindow win;

    public GameStatePlaying(AppWindow win) {
        this.win = win;
    }

    public void nextState(AppWindow context) {
        this.win = context;
    }
    
    public void animate() {

    }
    
}
