package org.example;

import java.util.Scanner;

/* Meny klassen där menyn är och fungerar
* Skapar vapnet och hero med angivna namn
* Låter spelare välja 3 alternativ gå på äventyr, info om hero och avsluta spel*/

public class MenuEngine {
    private Scanner scanner = new Scanner(System.in);

public MenuEngine() {

    // Skapar vapnet
    System.out.println("Vad ska ditt vapen heta?");
    String weaponName = scanner.nextLine();
    Weapon weapon = new Weapon(weaponName, 10); // Skapar ett vapen med de angivna namnet och 10 attack power

    // Skapar hero
    System.out.println("--------------------------");
    System.out.println("Vad ska din karaktär heta?");
    String heroName = scanner.nextLine();
    Hero hero = new Hero(heroName, weapon); // Skapar hero med de angivna namnet och vapnets attack power

    // Visar grund info
    System.out.println("--------------------------");
    System.out.println("Din hjälte heter: " + hero.getName());
    System.out.println("Ditt vapen heter: " + hero.getWeapon().getName());
    System.out.println("Attack Power: " + hero.getWeapon().getAttackPower());

    boolean running = true;

    // While loop för menyn
    while (running) {
        System.out.println("--------------------------");
        System.out.println("Välj ett alternativ");
        System.out.println("[1] Gå på äventyr");
        System.out.println("[2] Visa hero info");
        System.out.println("[0] Avsluta spelet");


        int choice = scanner.nextInt();
        scanner.nextLine();

        // Går på äventyr
        switch (choice) {
            case 1:
                System.out.println("--------------------------");
                System.out.println("Gå på äventyr");
                Encounter encounter = new Encounter();
                encounter.startAdventure(hero);
                break;

                // Visar Hero info
            case 2:
                System.out.println("--------------------------");
                System.out.println("=== Hero info ===");
                System.out.println("Namn: " + hero.getName());
                System.out.println("Hp: " + hero.getHp() + " / " + hero.getMaxHp());
                System.out.println("Level: " + hero.getLevel());
                System.out.println("XP: " + hero.getXp() + " / " + " 100");
                System.out.println("Vapen: " + hero.getWeapon().getName());
                break;

                // Avslutar spelet
            case 0:
                System.out.println("--------------------------");
                System.out.println("Spelet avslutas");
                running = false;
                break;

                // Vid felaktig siffra visas fel meddelande
            default:
                System.out.println("Ogiltigt val");
                break;
        }
    }
}

}
