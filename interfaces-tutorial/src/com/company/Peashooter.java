package com.company;

public class Peashooter implements IGun{

    private int damage = 30;

    public Peashooter(int damage) {
        this.damage = damage;
    }

    public Peashooter() { }


    @Override
    public String getDescription() {
        return "Duckgun with " + damage;
    }

    @Override
    public void dealDamage(Player target) {
        System.out.println("The peashooter, isn't too strong, we have damage falloff");
        target.takeDamage((int) this.damage / 3);
    }

}
