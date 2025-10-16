package org.example;

/* Sköter battle systemet
*  Monster och Hero attackerar turvis och Hero börjar
*  Har även funktionen för Boss special attack här */

public class BattleEngine {

public void startBattle(Hero hero, Monster monster) {

    monster.roar();

    int round = 0;
    while(hero.isAlive() && monster.isAlive()) { // Strid pågår så länge båda lever
        round ++;
        System.out.println("----- Runda " + round + " -----");

        /* Herons attack som börjar först */
        hero.attackMessage();
        monster.takeDamage(hero.attackPower); // Monster tar damage och mängden damage blir herons attack power.
        System.out.println(hero.getName() + " gjorde " + hero.attackPower + " i skada!");
        System.out.println(monster.getName() + " har " + monster.hp + " hp kvar!");

        /* Om monstret dör så vinner spelaren */
        if (!monster.isAlive()) {
            System.out.println(hero.getName() + " Vann!!");
            hero.gainXp(monster.getXpReward()); // Heron får xp och mängde blir lika mycket som monstrets xp reward
            return;
        }

        monster.attackMessage();

        /* Monstrets attack
        * Om de är en boss och random nummret blir mindre eller likamed 0.30 så gör bossen en special attack 2x damage */
        if (monster instanceof Boss && Math.random() <= 0.30) {
            hero.takeDamage(monster.attackPower * 2); //Heron tar dubbla monstrets attackpower i damage
            System.out.println("Bossen lägger en special attack och gör dubbel damage!!!");
            System.out.println(monster.getName() + " gjorde " + monster.attackPower * 2 + " i skada!");
            System.out.println(hero.getName() + " har " + hero.hp + " hp kvar!");

        } else { // annars en vanlig attack
            hero.takeDamage(monster.attackPower); // Hero tar damage och mängden damage blir monstrets attack power.
            System.out.println(monster.getName() + " gjorde " + monster.attackPower + " i skada!");
            System.out.println(hero.getName() + " har " + hero.hp + " hp kvar!");

        }
        /* Om hero dör blir det game over och spelet avslutas*/
        if (!hero.isAlive()){
            System.out.println("Game over!!!");
            System.exit(0);
        }


    }
}

}
