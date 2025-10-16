package org.example.Engines;

/* Sköter slumpmässiga funktioner under äventyr
*  70% chans för vanlig Zombie
*  10% chans för Giant Zombie (Boss)
*  20% chans för säker plats */

import org.example.Characters.Boss;
import org.example.Characters.Hero;
import org.example.Characters.Monster;
import org.example.Characters.Zombie;

public class Encounter {

    public void startAdventure(Hero hero){
        double random = Math.random();

        /* Om random hamnar på 0.70 eller mindre så blir det en zombie - 70% chans */
        if (random <= 0.70) {
            Monster Zombie = new Zombie();
            System.out.println("En Zombie dyker upp!");
            BattleEngine battle = new BattleEngine();
            battle.startBattle(hero, Zombie);

            /* Om random hamnar på 0.80 eller mindre så blir det en boss - 10% chans */
        } else if (random <= 0.80) {
            Monster Boss = new Boss();
            System.out.println("En Boss dyker upp!!!");
            BattleEngine battle = new BattleEngine();
            battle.startBattle(hero, Boss);

            /* Om random hamnar över 0.80 så blir det en säker plats - 20% chans*/
        } else {
            System.out.println("En säker plats och du hittade 30 XP!");
            hero.gainXp(30);
        }
    }
}
