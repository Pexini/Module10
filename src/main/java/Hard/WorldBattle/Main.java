package Hard.WorldBattle;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.CharactersFactory;
import Hard.WorldBattle.Characters.Hero.*;

import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Characters.TypeOfHero.*;
import Hard.WorldBattle.Characters.Villain.Dark_Soul;
import Hard.WorldBattle.Characters.Villain.Hunter;
import Hard.WorldBattle.Characters.Villain.Killer;
import Hard.WorldBattle.Characters.Villain.Vampire;

import java.util.Scanner;

import static Hard.WorldBattle.Characters.CharactersFactory.getCharacter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character hero1 = new Detective();
        Character hero2 = new Librarian();
        Character hero3 = new Prince_of_Moon();
        Character hero4 = new White_Witch();

        Character villain1 = new Dark_Soul();
        Character villain2 = new Hunter();
        Character villain3 = new Killer();
        Character villain14 = new Vampire();


        System.out.println("Welcome in new battle between Heroes and Villains...");
        System.out.println("please choice your Hero: ");
        System.out.println(" For choise 1: " + getHeroInfo(hero1));
        System.out.println(" For choise 2: " + getHeroInfo(hero2));
        System.out.println(" For choise 3: " + getHeroInfo(hero3));
        System.out.println(" For choise 4: " + getHeroInfo(hero4));

    }

    public static String getHeroInfo(Character character) {
        AbstrCharacter hero = (AbstrCharacter) character;
        return String.format("%s (Character: %s, Weapon: %s, Damage: %s, Health: %s",
                hero.getHeroType(),
                character.getName(),
                character.getWeapon().getName(),
                character.getWeapon().getDamage(),
                character.getHealth());


    }
}
