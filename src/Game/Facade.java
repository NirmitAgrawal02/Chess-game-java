package Game;

/**
 * @author - Nirmit Agrawal
 * Version - 1.3
 */
import java.util.Scanner;
import java.util.Iterator;
public class Facade {
    String player1 = "";
    String player2 = "";
    public void startFacade()
    {
        Scanner sc = new Scanner(System.in);
        Players pl = new Players();
        pl.username();
        player1 = "" + pl.player1;
        player2 = "" + pl.player2;
        Board bl = new Board();
        bl.set_pieces();
        bl.display();
    }
}
