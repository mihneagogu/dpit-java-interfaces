package com.company;

// Shoots ducks!
public class Duckgun implements IGun {

    private int damage = 30;

    public Duckgun(int damage) {
        this.damage = damage;
    }

    public Duckgun() { }


    @Override
    public String getDescription() {
        return "Duckgun with " + damage;
    }

    @Override
    public void dealDamage(Player target){
        System.out.println("Shooting the duckgun!");
        target.takeDamage(this.damage);
    }
}
