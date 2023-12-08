package com.celestinjoy.learnspring;

import com.celestinjoy.learnspring.game.GameRunner;
import com.celestinjoy.learnspring.game.Pacman;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
