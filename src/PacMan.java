import breadboards.GImage;

public class PacMan extends GImage {
    private static final String PACMAN_UP_IMAGE = "pacman_up.png";
    private static final String PACMAN_LEFT_IMAGE = "pacman_left.png";
    private static final String PACMAN_DOWN_IMAGE = "pacman_down.png";
    private static final String PACMAN_RIGHT_IMAGE = "pacman_right.png";

    // Giving the super implementation the file name for the pacman facing right when
    // creating a new object
    public PacMan() {
        super(PACMAN_RIGHT_IMAGE);
    }

    public void moveUp() {
        this.setImage(PACMAN_UP_IMAGE);
        this.move(0, -Constants.MOVE_DISTANCE);
    }

    public void moveLeft() {
        this.setImage(PACMAN_LEFT_IMAGE);
        this.move(-Constants.MOVE_DISTANCE, 0);
    }

    public void moveDown() {
        this.setImage(PACMAN_DOWN_IMAGE);
        this.move(0, Constants.MOVE_DISTANCE);
    }

    public void moveRight() {
        this.setImage(PACMAN_RIGHT_IMAGE);
        this.move(Constants.MOVE_DISTANCE, 0);
    }
}
