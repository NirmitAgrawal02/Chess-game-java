package Pieces;
/**
 * Author - Nirmit Agrawal
 * Version - 1.0
 */
public class Bishops extends Pieces{
    int x,y,color;
    boolean killed;
    Bishops(int x,int y,int color)
    {
        super(x,y,color);
    }

    /**
     * Getter Function for bishop which gives the coordinate and the color
     *  of the bishop as well as whether the bishop is killed or not
     */
    public void get_Bishop(int x,int y, int color,boolean killed)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.killed = killed;
    }
    public boolean status()
    {
        return killed;
    }
    public boolean isValidPath()
    {
        return true;
    }

    public boolean showPath()
    {
        return true;
    }
    public int move()
    {
        return 1;
    }
}
