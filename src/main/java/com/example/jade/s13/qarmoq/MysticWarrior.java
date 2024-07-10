/*
 * Introduction to Java Design Principles and Patterns
 * 
 * https://github.com/egalli64/jade
 */
package com.example.jade.s13.qarmoq;

public class MysticWarrior implements Fighter, Healer {
    private static final int HEALING_POWER = 2;
    private Warrior warrior;

    public MysticWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public void heal(Actor target) {
        target.addLife(HEALING_POWER);
    }

    /**
     * Auto healing
     */
    public void heal() {
        heal(this.warrior);
    }

    @Override
    public boolean fight(Actor other) {
        return warrior.fight(other);
    }

}
