package org.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RockPaperScissorsGame extends Game{
    public RockPaperScissorsGame(Player player1, PCPlayer player2) {
        super();
        user_input = new Scanner(System.in);
        System.out.println("Please enter your name");
        player1.setPlayerName(user_input.next());

        play(player1, player2);
    }

    public void play(Player player1, PCPlayer player2) {
        //uses input from both players for the game

        // menu of Rock/Paper/Scissors
        String[] gameOptions = {"Rock","Paper","Scissors"};
        System.out.println("Please enter your choice:");
        for (int i = 0; i < gameOptions.length; i++) {
            System.out.println((i+1) + " : " + gameOptions[i]);
        }
        player1.setPlayerChoice(user_input.nextInt());

        System.out.println(player2.getPlayerName() + " is thinking ...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        player2.decideOnPlayerChoice();


        // logic for rock paper scissors comparisons
        if (player1.getPlayerChoice() == player2.getPlayerChoice()) {
            System.out.println("Game is a draw");
        } /*else if () {
            //
        }*/
    }

}
