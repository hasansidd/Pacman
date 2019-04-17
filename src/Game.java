import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import breadboards.Breadboard;

public class Game extends Breadboard {
    private PacMan pacMan;
    private Maze maze;

    public Game() {
        this.getTextArea().setText("Get Ready To Play Some PacMan!");
        this.getButton1().setText("Play");
        this.setCenterPanelSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        this.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        new Game();
    }

    public void onButton1Click() {
        initKeyboardListener();

        maze = new Maze();
        this.add(maze);

//        pacMan = new PacMan(Constants.PACMAN_SIZE * Maze.cellWidth, Constants.PACMAN_SIZE * Maze.cellHeight);
        pacMan = new PacMan();
        this.add(pacMan);

        maze.centerPacman(pacMan);
    }

    private void initKeyboardListener() {
        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (maze.canMove(pacMan, e)) {
                    switch (e.getKeyCode()) {
                        case Constants.MOVE_UP:
                            pacMan.moveUp();
                            break;
                        case Constants.MOVE_LEFT:
                            pacMan.moveLeft();
                            break;
                        case Constants.MOVE_DOWN:
                            pacMan.moveDown();
                            break;
                        case Constants.MOVE_RIGHT:
                            pacMan.moveRight();
                            break;
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        this.setFocusable(true);
        this.requestFocusInWindow();
    }

}
