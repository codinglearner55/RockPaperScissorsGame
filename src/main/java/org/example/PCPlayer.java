package org.example;

import java.util.Random;

import static java.lang.Math.random;

public class PCPlayer implements Player {


    String playerName;
    int playerChoice;

    public PCPlayer() {
        setPlayerName("Computer Player");
    }

    @Override
    public int getPlayerChoice() {
        return playerChoice;

    }

    @Override
    public void setPlayerChoice(int playerChoice) {
        this.playerChoice = playerChoice;
    }

    @Override
    public String getPlayerName() {
        return playerName;
    }

    @Override
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void decideOnPlayerChoice () {
        Random random = new Random();
        int randomChoice = random.nextInt(3);
        randomChoice++;
        setPlayerChoice(randomChoice);
    }
}
