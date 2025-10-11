package org.example;

public abstract class Monster extends Character {

    public Monster(String name, int maxHp, int attackPower) {
        super(name, 50, 8);
    }

    public void attack(Character target) {
        target.hp -= this.attackPower;
        System.out.println(name + " attackerar " + target.getName() + " för " + attackPower + " skada!");
    }
}
