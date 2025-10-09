package org.example;

public abstract class Character {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int attackPower;

    public Character(String name, int maxHp, int attackPower) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attackPower = attackPower;
    }

    public abstract void attack(Character target);

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }
}
