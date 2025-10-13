package org.example;

public class Hero extends Character {
    private int xp;
    private int level;
    private int gold;

    public Hero(String name) {
        super(name, 100, 10);
        this.level = 1;
        this.xp = 0;
        this.gold = 0;
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
}
