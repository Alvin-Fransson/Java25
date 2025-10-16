package org.example.Characters;

/* Konkret metod som ärver från Character
*  Innehåller xp, level och ett vapen */

import org.example.Weapons.Weapon;

public class Hero extends Character {
    private int xp;
    private int level;
    private Weapon weapon;

    // Konstruktor
    public Hero(String name, Weapon weapon) {
        super(name, 100, weapon.getAttackPower());
        this.weapon = weapon;
        this.level = 1;
        this.xp = 0;
    }

    // Metod för att få xp och kör level upp metoden vid 100 xp
    public void gainXp(int amount) {
        xp += amount;
        if (xp >= 100 ) {
            levelUp();
        }
    }

    // Metod för att levla upp, level ökar med 1, xp minskar med 100, max hp ökar med 20 och hp återställs till max hp
    private void levelUp() {
        level = level + 1;
        xp = xp - 100;
        maxHp = maxHp + 20;
        hp = maxHp;
        System.out.println("Du gick upp till level " + level + "!");

        // Når man level 10 så vinner man och spelet avslutas
        if (level >= 10) {
            System.out.println("Du nådde level 10 och klarade spelet grattis!!!");
            System.exit(0);
        }
    }

    //Getters
    public Weapon getWeapon() {
        return weapon;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    // attack meddelande metod som ärvs från Character
    @Override
    public void attackMessage() {
        System.out.println(name + " svingar med sin " + weapon.getName() + "!");
    }
}
