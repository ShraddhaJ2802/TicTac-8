package com.bridgelab.tictactoe;

import java.util.Scanner;

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

    public void chooseLetter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose a letter: X or O :");
        chooseLetter=sc.next().toUpperCase().charAt(0);
        if(chooseLetter=='X')
        {
            computerLetter='X';
        }
        else
        {
            computerLetter='O';
        }
    }

}
