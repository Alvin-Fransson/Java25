package org.example;

public abstract class Monster extends Character {


    private int xpReward;

    public Monster(String name, int maxHp, int attackPower, int xpReward) {
        super(name, maxHp, attackPower);
        this.xpReward = xpReward;
    }

    public int getXpReward(){
        return xpReward;
    }

}
