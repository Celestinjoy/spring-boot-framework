package com.celestinjoy.learnspring.game;

public class Pacman implements GamingConsole{
    @Override
    public void up() {
        System.out.println("U turn to left");
    }

    @Override
    public void down() {
        System.out.println("U turn to right");
    }

    @Override
    public void left() {
        System.out.println("turn left");
    }

    @Override
    public void right() {
        System.out.println("turn right");
    }
}
