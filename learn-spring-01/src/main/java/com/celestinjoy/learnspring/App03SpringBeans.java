package com.celestinjoy.learnspring;

import com.celestinjoy.learnspring.game.GameRunner;
import com.celestinjoy.learnspring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03SpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
         context.getBean(GamingConsole.class).up();
         context.getBean(GameRunner.class).run();
        }
    }
}
