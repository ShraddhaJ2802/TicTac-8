package com.bridgelab.tictactoe;

public class TicTacTaeGame {

    char [] board=new char[10];

    char chooseLetter;
    char computerLetter;

    //UC1- creating empty board
    public void createBoard()
    {
        for(int i=1;i< board.length;i++)
        {
            board[i]=' ';
        }
    }

}
