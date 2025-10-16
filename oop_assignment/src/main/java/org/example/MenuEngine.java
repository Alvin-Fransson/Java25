package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MenuEngine {
    private Scanner scanner = new Scanner(System.in);
    private Hero hero;
    private Weapon weapon;


public MenuEngine() {
    System.out.println("Vad ska ditt vapen heta?");
    String weaponName = scanner.nextLine();
    Weapon weapon = new Weapon(weaponName, 10);

    System.out.println("--------------------------");
    System.out.println("Vad ska din karaktär heta?");
    String heroName = scanner.nextLine();
    Hero hero = new Hero(heroName, weapon);

    System.out.println("--------------------------");
    System.out.println("Din hjälte heter: " + hero.getName());
    System.out.println("Ditt vapen heter: " + hero.getWeapon().getName());
    System.out.println("Attack Power: " + hero.getWeapon().getAttackPower());

    boolean running = true;

    while (running) {
        System.out.println("--------------------------");
        System.out.println("Välj ett alternativ");
        System.out.println("[1] Gå på äventyr");
        System.out.println("[2] Visa hero info");
        System.out.println("[0] Avsluta spelet");


        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("--------------------------");
                System.out.println("Gå på äventyr");
                Encounter encounter = new Encounter();
                encounter.startAdventure(hero);
                break;

            case 2:
                System.out.println("--------------------------");
                System.out.println("=== Hero info ===");
                System.out.println("Namn: " + hero.getName());
                System.out.println("Hp: " + hero.hp + " / " + hero.maxHp);
                System.out.println("Level: " + hero.getLevel());
                System.out.println("XP: " + hero.getXp() + " / " + " 100");
                System.out.println("Vapen: " + hero.getWeapon().getName());
                break;

            case 0:
                System.out.println("--------------------------");
                System.out.println("Spelet avslutas");
                running = false;
                break;

            default:
                System.out.println("Ogiltigt val");
                break;
        }
    }
}

}
