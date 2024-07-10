/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.qarmoq;

public class MainDecorator {

    public static void main(String[] args) {
        Game game = new Game();
        Warrior tom = new Warrior("Tom");

        game.beginning(tom);
        game.meetZoe(tom);
        game.magicRoom(tom);
    }
}
