package org.example.Characters;

/*
* Abstract klass som mall för karaktärer i spelet.
* Hero och monster ärver från denna klass.
* Innehåller Name, Hp, maxHp, attackPower
*/

public abstract class Character {
    // Protected = tillgänglig för barnklasser men inte utifrån.
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int attackPower;

    //Konstruktor
    public Character(String name, int maxHp, int attackPower) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attackPower = attackPower;
    }

    //Metod för att ta skada.
    public void takeDamage(int damage) {
        hp = hp - damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    //Metod för att se så att karaktären lever
    public boolean isAlive()  {
        return hp > 0;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    //Abstract metod som barn klasser implementerar, visar hur karaktärer attackerar.
    public abstract void attackMessage();

}
