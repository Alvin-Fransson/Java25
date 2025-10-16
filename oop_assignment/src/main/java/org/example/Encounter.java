package org.example;

import java.util.Random;

public class Encounter {

    public void startAdventure(Hero hero){
        double random = Math.random();
        if (random < 0.70) {
            Monster Zombie = new Zombie();
            System.out.println("En Zombie dyker upp!");
            BattleEngine battle = new BattleEngine();
            battle.startBattle(hero, Zombie);

        } else if (random < 0.80) {
            Monster Boss = new Boss();
            System.out.println("En Boss dyker upp!!!");
            BattleEngine battle = new BattleEngine();
            battle.startBattle(hero, Boss);
            
        } else {
            System.out.println("En säker plats och du hittade 30 XP!");
            hero.gainXp(30);
        }
    }
}
