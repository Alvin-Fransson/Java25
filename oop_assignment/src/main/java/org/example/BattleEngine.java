package org.example;

public class BattleEngine {

public void startBattle(Hero hero, Monster monster) {

    int round = 0;
    while(hero.isAlive() && monster.isAlive()) {

        round ++;
        System.out.println("----- Runda " + round + " -----");
        monster.takeDamage(hero.attackPower);
        System.out.println(hero.getName() + " attackerar och gör " + hero.attackPower + " i skada!");
        System.out.println(monster.getName() + " har " + monster.hp + " hp kvar!");

        if (!monster.isAlive()) {
            System.out.println(hero.getName() + " Vann!!");
            hero.gainXp(monster.getXpReward());
            return;
        }

        if (monster instanceof Boss && Math.random() <= 0.30) {
            hero.takeDamage(monster.attackPower * 2);
            System.out.println("Bossen lägger en special attack och gör dubbel damage!!!");
            System.out.println(monster.getName() + " attackerar och gör " + monster.attackPower * 2 + " i skada!");
            System.out.println(hero.getName() + " har " + hero.hp + " hp kvar!");

        } else {
            hero.takeDamage(monster.attackPower);
            System.out.println(monster.getName() + " attackerar och gör " + monster.attackPower + " i skada!");
            System.out.println(hero.getName() + " har " + hero.hp + " hp kvar!");

        }

        if (!hero.isAlive()){
            System.out.println("Game over!!!");
            System.exit(0);
        }


    }
}

}
