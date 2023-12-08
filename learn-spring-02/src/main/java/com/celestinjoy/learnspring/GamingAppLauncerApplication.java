package com.celestinjoy.learnspring;

import com.celestinjoy.learnspring.game.GameRunner;
import com.celestinjoy.learnspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.celestinjoy.learnspring.game")
public class GamingAppLauncerApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncerApplication.class)) {
         context.getBean(GamingConsole.class).up();
         context.getBean(GameRunner.class).run();
        }
    }
}
