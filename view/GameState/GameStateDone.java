package view.GameState;

import view.AppWindow;

public class GameStateDone implements GameState {

    AppWindow win;

    public GameStateDone(AppWindow win) {
        this.win = win;
    }

    public void nextState(AppWindow context) {
        this.win = context;
    }
    
    public void animate() {

    }
    
}