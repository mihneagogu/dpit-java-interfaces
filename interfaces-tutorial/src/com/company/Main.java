package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Andrei");

        List<Duckgun> duckguns = new ArrayList<>();
        List<Shotgun> shotguns = new ArrayList<>();
        List<Peashooter> peashooters = new ArrayList<>();

        for (int dmg = 1; dmg <= 5; dmg++) {
            duckguns.add(new Duckgun(dmg * 10));
            shotguns.add(new Shotgun(dmg * 3));
            peashooters.add(new Peashooter(dmg * 7));
        }

        for (var duckgun : duckguns){
           duckgun.dealDamage(player);
        }
        System.out.println();

        for (var shotgun : shotguns){
            shotgun.dealDamage(player);
        }
        System.out.println();

        for (var peashooter : peashooters){
            peashooter.dealDamage(player);
        }

    }

}
