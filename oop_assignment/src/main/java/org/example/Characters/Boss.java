package org.example.Characters;

/* Bossen i spelet och ärver från Monster */

public class Boss extends Monster {

    public Boss() {
        super("Giant Zombie", 100, 5, 50);
    }

    @Override
    public void roar() {
        System.out.println("Giant Zombie skriker högt och aggresivt!!");
    }

    @Override
    public void attackMessage() {
        System.out.println(name + " plockar upp hjälten!");
    }

}
