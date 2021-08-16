package board;

import java.util.Objects;

public class Key {
    private int row;
    private int col;

    public Key(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return row == key.row && col == key.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
