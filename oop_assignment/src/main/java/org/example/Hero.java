package org.example;

public class Hero extends Character {
    private int xp;
    private int level;
    private Weapon weapon;

    public Hero(String name, Weapon weapon) {
        super(name, 100, weapon.getAttackPower());
        this.weapon = weapon;
        this.level = 1;
        this.xp = 0;
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
        System.out.println("Du gick upp till level " + level + "!");

        if (level >= 10) {
            System.out.println("Du nådde level 10 och klarade spelet grattis!!!");
            System.exit(0);
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }
}
