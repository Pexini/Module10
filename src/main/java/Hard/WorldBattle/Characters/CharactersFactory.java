package Hard.WorldBattle.Characters;

import Hard.WorldBattle.Characters.Hero.*;

import Hard.WorldBattle.Characters.Villian.*;

import static Hard.WorldBattle.Characters.TypeOfHero.*;
import static Hard.WorldBattle.Characters.TypeOfVillain.*;

public class CharactersFactory {
    public static Character getCharacter(TypeOfHero typeOfHero, TypeOfVillain typeOfVillain) {
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
        if (Dark_Soul.equals(typeOfVillain)) {
            return new Dark_Soul();
        }
        if (Killer.equals(typeOfVillain)) {
            return new Killer();
        }
        if (Vampire.equals(typeOfVillain)) {
            return new Vampire();
        }
        if (Hunter.equals(typeOfVillain)) {
            return new Hunter();
        }
        throw new IllegalArgumentException("Wrong Type of Characters");
    }
}
