package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Andrei");
        // Duckgun duck = new Duckgun(500);
        // Duckgun duckTwo = new Duckgun();

        // Shotgun sgOne = new Shotgun(35);
        // Shotgun sgTwo = new Shotgun();

        // duck.dealDamage(player);
        // duckTwo.dealDamage(player);
        // System.out.println();

        // sgOne.dealDamage(player);
        // sgTwo.dealDamage(player);
        // System.out.println();

        List<Duckgun> duckguns = new ArrayList<>();
        for (int damage = 10; damage < 50; damage += 10) {
            duckguns.add(new Duckgun(damage * 3));
        }
        List<Shotgun> shotguns = new ArrayList<>();
        for (int damage = 10; damage < 50; damage += 10) {
            shotguns.add(new Shotgun(damage * 2));
        }
        for (Duckgun duckgun : duckguns) {
            duckgun.dealDamage(player);
        }
        System.out.println();

        for (Shotgun shotgun : shotguns) {
            shotgun.dealDamage(player);
        }
        System.out.println();

        List<Peashooter> peashooters = new ArrayList<>();
        for (int damage = 10; damage < 50; damage += 10) {
            peashooters.add(new Peashooter(damage * 5));
        }
        for (var peashooter : peashooters) {
            peashooter.dealDamage(player);
        }
        System.out.println();
    }

 }
