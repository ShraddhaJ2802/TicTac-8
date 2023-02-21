import com.bridgelab.tictactoe.TicTacTaeGame;

public class Main {
    public static void main(String[] args) {

        TicTacTaeGame tc=new TicTacTaeGame();

        tc.createBoard();

        tc.chooseLetter();

        tc.showBoard();

        tc.playerTurn();

        tc.checkFreeSpace();

    }


}