package model;

import java.util.ArrayList;

import controller.App;
import view.AppWindow;

public class Snake {

    public ArrayList<SnakeNode> nodes = new ArrayList<>();
    private final int INIT_XLOC = AppWindow.GRID_SIZE * 7;
    private final int INIT_YLOC = AppWindow.GRID_SIZE * 3;
    private final int INIT_NODES = 6;
    private Direction direction;

    public Snake() {
        init();
    }

    public void init() {
        nodes.clear();
        direction = Direction.RIGHT;
        for(int i = 0; i < INIT_NODES; i++) {
            int x = INIT_XLOC - (i * AppWindow.GRID_SIZE);
            int y = INIT_YLOC;
            nodes.add(new SnakeNode(x, y));
        }
    }
}
