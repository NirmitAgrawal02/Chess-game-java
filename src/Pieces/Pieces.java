package Pieces;

/**
 * Author - Nirmit Agrawal
 * Version - 1.0
 */
public abstract class Pieces {
    int x,y;
    int color;
    public Pieces(int x,int y, int color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public abstract boolean isValidPath();
//    public abstract int[][] showPath(int x, int y);
    public abstract int move();
}
