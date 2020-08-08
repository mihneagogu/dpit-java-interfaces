package com.company;

public class Player {

    private static final int MAX_HP = 1000;
    private String name;
    private int hp;


    public Player(String name) {
        this.name = name;
        this.hp = MAX_HP;
    }

    // Player takes `amount` damage
    public void takeDamage(int amount) {
        this.hp -= amount;
        if (hp <= 0) {
            System.out.println(name + " has died. Respawning!");
            hp = MAX_HP;
        } else {
            System.out.println(name + " taking " + amount + " damage, " + this.hp + " remaining");
        }
    }
}

