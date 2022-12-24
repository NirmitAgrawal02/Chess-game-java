package Game;
import Pieces.*;

import java.util.*;

/**
 * Author - Nirmit Agrawal
 * Version - 1.0
 */
public class Board {
    String[][] board = new String[9][9];
    int [][] size = new int[9][9];
    String [][] color = new String[8][8];
    List<String> PieceSet = new ArrayList<>();
    Board()
    {
        PieceSet.add("Rook");
        PieceSet.add("Knight");
        PieceSet.add("Bishop");
        PieceSet.add("Queen");
        PieceSet.add("King");
        PieceSet.add("Bishop");
        PieceSet.add("Knight");
        PieceSet.add("Rook");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        PieceSet.add("Pawn");
        for(int i = 0;i<8;i++)
        {
            for(int j = 0;j<8;j++)
            {
                if(i%2 == 0 && j % 2 == 0)
                {
                    color[i][j] = "Black";
                }
                else if(i % 2 == 0 && j % 2 != 0)
                {
                    color[i][j] = "White";
                }
                else if(j % 2 == 0)
                {
                    color[i][j] = "White";
                }
                else
                {
                    color[i][j] = "Black";
                }
            }
        }
    }
    public void set_pieces()
    {
        int  k = 0;
        for(int i = 0;i<=8;i++)
        {
            for(int j = 0;j<=8;j++)
            {
                if(i == 0 && j > 0)
                {
                    int c = 96 + j;
                    board[i][j] = "" + (char)c ;
                }
                else if(j == 0 && i>0)
                {
                    board[i][j] = "" + i;
                }
                else if(i == 2)
                {
                    board[i][j] = "W" + PieceSet.get(8+j-1).substring(0,1);
                }
                else if(i == 1){
                    board[i][j] = "W" + PieceSet.get(j-1).substring(0,1);
                }
                else if(i == 7)
                {
                    board[i][j] = "B" + PieceSet.get(8+j-1).substring(0,1);
                }
                else if(i == 8)
                {
                    board[i][j] = "B" + PieceSet.get(j-1).substring(0,1);
                }
                else
                {
                    board[i][j] = "";
                }

            }
        }
    }
    public void display()
    {
        for(int i = 0;i<board.length;i++)
        {
            for(int j = 0;j< board[0].length;j++)
            {
                System.out.print(board[i][j] +"|");
            }
            System.out.println();
        }
    }

}
