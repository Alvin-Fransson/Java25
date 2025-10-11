package org.example;

public class Zombie extends Monster {

    public Zombie() {
        super("Zombie", 50,8);
    }

    @Override
    public void attack(Character target) {
        target.hp -= this.attackPower;
        System.out.println(getName() + " biter " + target.getName() + " för " + attackPower + " skada!");
    }
}

