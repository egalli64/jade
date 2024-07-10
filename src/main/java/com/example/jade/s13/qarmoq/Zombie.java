/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.qarmoq;

import java.util.logging.Logger;

public class Zombie extends Actor implements Fighter {
    private static final Logger log = Logger.getGlobal();

    public Zombie(String name) {
        super(name);
    }

    @Override
    public boolean fight(Actor other) {
        log.info(String.format("%s %s wins this round of fight", getClass().getSimpleName(), getName()));
        other.wound(1);
        return true;
    }

}
