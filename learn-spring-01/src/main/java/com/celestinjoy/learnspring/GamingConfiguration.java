package com.celestinjoy.learnspring;

import com.celestinjoy.learnspring.game.GameRunner;
import com.celestinjoy.learnspring.game.GamingConsole;
import com.celestinjoy.learnspring.game.Pacman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new Pacman();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
