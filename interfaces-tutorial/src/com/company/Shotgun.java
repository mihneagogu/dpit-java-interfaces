package com.company;

public class Shotgun {
    private int damage = 150;

    public Shotgun(int damage) {
        this.damage = damage;
    }

    public Shotgun() {
    }

    public String getDescription() {
        return "Shotgun with " + damage + "! I am a stronk weapon!";
    }

    public void dealDamage(Player target) {
        System.out.println("HAHA! Shotguns are powerful weapons" +
                ", we have 2 pellets, so we deal double damage");
        target.takeDamage(this.damage * 2);
    }
}
