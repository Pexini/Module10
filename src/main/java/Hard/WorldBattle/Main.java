package Hard.WorldBattle;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.Hero.*;

import Hard.WorldBattle.Characters.Villain.Dark_Soul;
import Hard.WorldBattle.Characters.Villain.Hunter;
import Hard.WorldBattle.Characters.Villain.Killer;
import Hard.WorldBattle.Characters.Villain.Vampire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character hero1 = new Detective("Greg", 60);
        Character hero2 = new Librarian("Ton", 80);
        Character hero3 = new Prince_of_Moon("Ben", 90);
        Character hero4 = new Prince_of_Moon("Ben1", 80);
        Character hero5 = new White_Witch("Nick", 70);


        List<Character> villians = new ArrayList<>();
        villians.add(new Dark_Soul("Dred", 80));
        villians.add(new Hunter("Rint", 90));
        villians.add(new Killer("Mute", 50));
        villians.add(new Killer("Mute_v1", 70));
        villians.add(new Vampire("Pot", 90));


        System.out.println("Welcome in new battle between Heroes and Villains...");
        System.out.println("please choice your Hero: ");
        System.out.println(" For choise 1: " + getHeroInfo(hero1));
        System.out.println(" For choise 2: " + getHeroInfo(hero2));
        System.out.println(" For choise 3: " + getHeroInfo(hero3));
        System.out.println(" For choise 4: " + getHeroInfo(hero4));
        System.out.println(" For choise 5: " + getHeroInfo(hero5));

        int chouse = scanner.nextInt();
        Character chouseHero;
        switch (chouse) {
            case 1:
                chouseHero = hero1;
                System.out.println("Your choice: Detective");
                break;
            case 2:
                chouseHero = hero2;
                System.out.println("Your choice: Librarian");
                break;
            case 3:
                chouseHero = hero3;
                System.out.println("Your choice: Prince_of_Moon");
                break;
            case 4:
                chouseHero = hero4;
                System.out.println("Your choice:Prince_of_Moon_v2");
                break;
            case 5:
                chouseHero = hero5;
                System.out.println("Your choice: White_Witch");
                break;
            default:
                System.out.println("Invalid choice, selecting Detective by default.");
                chouseHero = hero1;
                System.out.println("Your choice: Detective");
                break;
        }
        Random random = new Random();
        Character computerVillain = villians.get(random.nextInt(villians.size()));
        System.out.println("Computer choice : " + getHeroInfo(computerVillain));


        System.out.println();
        System.out.println("Let the battle begin! ");
        System.out.println();
        while (chouseHero.isAlive() && computerVillain.isAlive()) {
            chouseHero.attack(computerVillain);
            System.out.println("У злодеев осталось здоровье " + computerVillain.getHealth());
            if (computerVillain.isAlive()) {
                computerVillain.attack(chouseHero);
                System.out.println("У героя осталось здоровья " + chouseHero.getHealth());
            }
        }
        if (!chouseHero.isAlive()) {
            System.out.println("Computers villains won!");
        } else {
            System.out.println("You won!");
        }
        scanner.close();
    }

    public static String getHeroInfo(Character character){
        return String.format("%s (Name: %s, Health: %d, Weapon: %s, Damage: %d)",
                character.getClass().getSimpleName(),
                character.getName(),
                character.getHealth(),
                character.getWeapon().getName(),
                character.getWeapon().getDamage());
    }


}


