package com.example.jade.s12;

public interface Healer {
    /**
     * Increase target status, when possible
     * 
     * @param target
     */
    void heal(Actor target);
}
