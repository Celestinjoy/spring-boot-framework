package com.celestinjoy.learnspring.game;

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
