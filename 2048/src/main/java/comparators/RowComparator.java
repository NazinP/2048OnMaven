package comparators;

import board.Key;

import java.util.Comparator;

public class RowComparator implements Comparator<Key> {
    @Override
    public int compare(Key o1, Key o2) {
        return o1.getCol() - o2.getCol();
    }
}
