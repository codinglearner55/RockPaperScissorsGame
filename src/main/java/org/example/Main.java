package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to Rock Paper Scissors!");

        HumanPlayer player1 = new HumanPlayer();
        PCPlayer player2 = new PCPlayer();

        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame (player1, player2);

    }
}