package view.GameState;

import view.AppWindow;

public interface GameState {
    
    public void nextState(AppWindow context);

    public void animate();
}
