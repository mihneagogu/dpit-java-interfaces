package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Andrei");

        List<IGun> weapons = new ArrayList<>();

        for (int dmg = 1; dmg <= 5; dmg++) {
            weapons.add(new Duckgun(dmg * 10));
            weapons.add(new Shotgun(dmg * 3));
            weapons.add(new Peashooter(dmg * 7));
        }

        for (IGun wep : weapons) {
            wep.dealDamage(player);
        }


    }

}
