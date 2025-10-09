package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Alvin");

        System.out.println("Namn: " + hero.getName());
        System.out.println("HP: " + hero.hp);
        System.out.println("Attack Power: " + hero.attackPower);
        System.out.println("Lever hjälten? " + hero.isAlive());

    }
}