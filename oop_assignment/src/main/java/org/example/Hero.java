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

    @Override
    public void attack(Character target) {
        target.hp -= this.attackPower;
        System.out.println(name + " attackerar " + target.getName() + " för " + attackPower + " skada;");
    }


    public void gainXp(int amount) {
        xp += amount;
        if (xp >= 100 && level < 10) {
            levelUp();
            xp -= 100;
        }
    }

    private void levelUp() {
        level++;
        maxHp += 20;
        hp = maxHp;
        System.out.println(name + " gick upp till level " + level + "!");
    }
}
