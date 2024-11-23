package view.GameState;

import view.AppWindow;

public class GameStateInit implements GameState {
    
    AppWindow win;

    public GameStateInit(AppWindow win) {
        this.win = win;
    }

    public void nextState(AppWindow context) {
        this.win = context;
    }
    
    public void animate() {

    }
}
