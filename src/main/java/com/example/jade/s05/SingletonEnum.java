package com.example.jade.s05;

public enum SingletonEnum {
    INSTANCE;

    private int life = 42;

    public int fight(int points) {
        life -= points;
        return life;
    }

    public int getLife() {
        return life;
    }
}
