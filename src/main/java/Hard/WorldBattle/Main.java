package Hard.WorldBattle;

import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.CharactersFactory;
import Hard.WorldBattle.Characters.Hero.*;

import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Characters.TypeOfHero.*;
import Hard.WorldBattle.Characters.Villain.Dark_Soul;
import Hard.WorldBattle.Characters.Villain.Hunter;
import Hard.WorldBattle.Characters.Villain.Killer;
import Hard.WorldBattle.Characters.Villain.Vampire;

import static Hard.WorldBattle.Characters.CharactersFactory.getCharacter;

public class Main {
    public static void main(String[] args) {
        Character hero1 = getCharacter(Detective);
        Character hero2 = getCharacter(Librarian);
        Character hero3 = getCharacter(Prince_of_Moon);
        Character hero4 = getCharacter(White_Witch);
        Character villain1 = getCharacter(Killer);
        Character villain2 = getCharacter(Vampire);
        Character villain3 = getCharacter(Dark_Soul);
        Character villain4 = getCharacter(Hunter);


    }
}
