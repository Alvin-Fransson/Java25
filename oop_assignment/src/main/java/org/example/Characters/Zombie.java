package org.example.Characters;

/* Ett vanligt monster som ärver från Monster klassen */

public class Zombie extends Monster {

    public Zombie() {
        super("Zombie", 50,5, 30);
    }

    @Override
    public void roar() {
        System.out.println("Zombien morrar aggresivt!");
    }

    @Override
    public void attackMessage() {
        System.out.println(name + " Biter mot hjälten!");
    }

}

