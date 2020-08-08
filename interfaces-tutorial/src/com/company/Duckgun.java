package com.company;

// Shoots ducks!
public class Duckgun {

    private int damage = 30;

    public Duckgun(int damage) {
        this.damage = damage;
    }

    public Duckgun() { }


    public String getDescription() {
        return "Duckgun with " + damage;
    }

    public void dealDamage(Player target){
        System.out.println("Shooting the duckgun!");
        target.takeDamage(this.damage);
    }
}
