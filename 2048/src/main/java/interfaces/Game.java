package interfaces;

import board.Board;
import enums.Direction;

public interface Game {
    void init();
    boolean canMove();
    boolean move(Direction direction);
    void addItem();
    Board getGameBoard();
    boolean hasWin();
}
