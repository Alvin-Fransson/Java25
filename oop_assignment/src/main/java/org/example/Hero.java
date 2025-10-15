package org.example;

import java.util.logging.Level;

public class Hero extends Character {
    private int xp;
    private int level;
    private int gold;
    private Weapon weapon;

    public Hero(String name, Weapon weapon) {
        super(name, 100, weapon.getAttackPower());
        this.weapon = weapon;
        this.level = 1;
        this.xp = 0;
        this.gold = 0;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void gainXp(int amount) {
        xp += amount;
        if (xp >= 100 ) {
            levelUp();
        }
    }

    private void levelUp() {
        level = level + 1;
        xp = xp - 100;
        maxHp = maxHp + 20;
        hp = maxHp;
        System.out.println("Du gick på till level " + level + "!");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getLevel() {
        return level;
    }
}
