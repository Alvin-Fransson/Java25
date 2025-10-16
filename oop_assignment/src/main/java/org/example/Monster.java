package org.example;

/* Abstract klass som ärver från character
* Innehåller namn, maxhp, attack power och xp reward*/

public abstract class Monster extends Character {


    private int xpReward;

    public Monster(String name, int maxHp, int attackPower, int xpReward) {
        super(name, maxHp, attackPower);
        this.xpReward = xpReward;
    }

    public int getXpReward(){
        return xpReward;
    }

    public abstract void roar();

}
