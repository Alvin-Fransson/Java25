package org.example.Weapons;

/* Vapnet som Hero använder sig utav i battle */

public class Weapon {
    private String name;
    private int attackPower;

    public Weapon(String name, int attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName(){
        return name;
    }

    public int getAttackPower(){
        return attackPower;
    }
}