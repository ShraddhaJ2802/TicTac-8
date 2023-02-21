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

    public void checkFirstPlayer()
    {
        int Head = 0;

        double toss = Math.floor(Math.random()*10) % 2;

        if ( toss == Head )
        {
            System.out.println("computer starts to play first");
        }
        else
        {
            System.out.println("User starts to play first");
        }
    }

    public  void winner()
    {
        if ((board[1] == chooseLetter && board[2] == chooseLetter && board[3] == chooseLetter) ||
                (board[4] == chooseLetter && board[5] == chooseLetter && board[6] == chooseLetter) ||
                (board[7] == chooseLetter && board[8] == chooseLetter && board[9] == chooseLetter) ||
                (board[1] == chooseLetter && board[5] == chooseLetter && board[9] == chooseLetter) ||
                (board[3] == chooseLetter && board[5] == chooseLetter && board[7] == chooseLetter))
        {
            showBoard();

            System.out.println("Player win the game");

            System.exit(0);
        }
    }

    public void computerTurn()
    {
        int computerMove;

        while (true)
        {
            computerMove = (int) Math.floor(Math.random() * 10) % 9 + 1;

            if (board[computerMove] == ' ')
            {
                break;
            }

        }
        System.out.println("Computer choose:: " + computerMove);

        board[computerMove] = computerLetter;
    }

}
