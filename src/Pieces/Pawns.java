package Pieces;
/**
 * Author - Nirmit Agrawal
 * Version - 1.0
 */
public class Pawns extends Pieces {
    int x,y,color;
    boolean killed;
    Pawns(int x, int y, int color) {
        super(x, y, color);
    }

    public boolean isValidPath() {
        return true;
    }

    public boolean showPath() {
        return true;
    }

    public int move() {
        return 1;
    }
}
