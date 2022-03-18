package com.example.jade.s05;

public class WrongSingletonLazy {
    private static WrongSingletonLazy instance = null;

    private int life;

    private WrongSingletonLazy() {
        this.life = 42;
    }

    /**
     * !!! NO SYNCHRONIZATION !!!
     * 
     * @return the instance (or "an" instance!)
     */
    public static WrongSingletonLazy getInstance() {
        if (instance == null) {
            // !!! more than one thread could get here !!!
            instance = new WrongSingletonLazy();
        }
        return instance;
    }

    public int fight(int points) {
        life -= points;
        return life;
    }
}
