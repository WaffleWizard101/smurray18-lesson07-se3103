package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ButtonPressListener;
import controller.KeyPressListener;
import view.GameState.*;

public class AppWindow extends JFrame {

    private AppCanvas canvas;

    private GameState gameState;

    public static final int GRID_SIZE = 20;

    public JButton startPauseButton;
    public JButton restartButton;
    public JButton exitButton;
    public static final String START_ACTION = "Start";
    public static final String PAUSE_ACTION = "Pause";
    public static final String RESTART_ACTION = "Restart";
    public static final String EXIT_ACTION = "Exit";

    public void init() {
        Container cp = getContentPane();
        canvas = new AppCanvas();
        cp.add(canvas, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        startPauseButton = new JButton(START_ACTION);
        restartButton = new JButton(RESTART_ACTION);
        exitButton = new JButton(EXIT_ACTION);
        southPanel.add(startPauseButton);
        southPanel.add(restartButton);
        southPanel.add(exitButton);
        cp.add(BorderLayout.SOUTH, southPanel);

        ButtonPressListener buttonPressListener = new ButtonPressListener();
        startPauseButton.addActionListener(buttonPressListener);
        restartButton.addActionListener(buttonPressListener);
        exitButton.addActionListener(buttonPressListener);

        KeyPressListener keyPressListener = new KeyPressListener();
        canvas.addKeyListener(keyPressListener);
        canvas.requestFocusInWindow();
        canvas.setFocusable(true);

        // disable focusable in other GUI components
        startPauseButton.setFocusable(false);
        restartButton.setFocusable(false);
        exitButton.setFocusable(false);

        gameState = new GameStateInit(this);
    }
    
    public AppCanvas getCanvas() {
        return canvas;
    }

    public void goNextState()
    {
        gameState.nextState(this);
    }

    public void setGameState(GameState state) {
        this.gameState = state;
    }
}
