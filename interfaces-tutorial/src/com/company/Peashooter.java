package com.company;

public class Peashooter {

    private int damage = 30;

    public Peashooter(int damage) {
        this.damage = damage;
    }

    public Peashooter() { }


    public String getDescription() {
        return "Duckgun with " + damage;
    }

    public void dealDamage(Player target) {
        System.out.println("The peashooter, isn't too strong, we have damage falloff");
        target.takeDamage((int) this.damage / 3);
    }

}
