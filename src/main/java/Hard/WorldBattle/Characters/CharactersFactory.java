package Hard.WorldBattle.Characters;

import Hard.WorldBattle.Characters.Hero.*;

import Hard.WorldBattle.Characters.Villain.*;

import static Hard.WorldBattle.Characters.TypeOfHero.*;


public class CharactersFactory {
    public static Character getCharacter(TypeOfHero typeOfHero) {
        if (Prince_of_Moon.equals(typeOfHero)) {
            return new Prince_of_Moon();
        }
        if (White_Witch.equals(typeOfHero)) {
            return new White_Witch();
        }
        if (Librarian.equals(typeOfHero)) {
            return new Librarian();
        }
        if (Detective.equals(typeOfHero)) {
            return new Detective();
        }
        if (Dark_Soul.equals(typeOfHero)) {
            return new Dark_Soul();
        }
        if (Killer.equals(typeOfHero)) {
            return new Killer();
        }
        if (Vampire.equals(typeOfHero)) {
            return new Vampire();
        }
        if (Hunter.equals(typeOfHero)) {
            return new Hunter();
        }
        throw new IllegalArgumentException("Wrong Type of Characters");
    }
}
