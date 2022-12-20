package Game;
/**
 * Author - Nirmit Agrawal
 * Version - 1.0
 */
import java.util.Scanner;
public class Players {
    String player1 = "";
    String player2 = "";
    Players()
    {

    }
    public void username()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the player who will be white");
        player1 = sc.nextLine();
        System.out.println("Enter the name of the player who will be black");
        player2 = sc.nextLine();
        System.out.println("Setting the board");
        Board bd = new Board();
    }
}
