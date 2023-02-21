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

    public void showBoard()
    {
        System.out.println(board[1] +"|| " +board[2] +"|| "+board[3]);

        System.out.println("-------------------------------------------------------------------------");

        System.out.println(board[4] +"|| " +board[5] +"|| "+board[6]);

        System.out.println("-------------------------------------------------------------------------");

        System.out.println(board[7] +"|| " +board[8] +"|| "+board[9]);


    }
    public void playerTurn()
    {
        int playerMove;

        while (true)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose your location(1-9): ");

            playerMove = scanner.nextInt();

            if (board[playerMove] == ' ')
            {
                break;
            }

        }

        System.out.println("Player choose:: " + playerMove);

        board[playerMove] = chooseLetter;
    }

    public void checkFreeSpace()
    {
        boolean isSpaceAvailable = false;
        int numOfFreeSpaces = 0;
        for(int index=1;index<board.length;index++)
        {
            if((board[index] == ' '))
            {
                isSpaceAvailable = true;
                numOfFreeSpaces++;
            }
        }
        if(isSpaceAvailable == false)
        {
            System.err.println("Board is full! You can't make another move");
            System.exit(0);
        }
        else
        {
            System.out.println("Free space is available! you have "+numOfFreeSpaces+ " moves left");
        }
    }
}
