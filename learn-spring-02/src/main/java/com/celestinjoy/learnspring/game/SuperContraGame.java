package com.celestinjoy.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("first")
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("jump");
    }
    public void down() {
        System.out.println("sit");
    }
    public void left() {
        System.out.println("slide back");
    }
    public void right() {
        System.out.println("slide front");
    }
}
