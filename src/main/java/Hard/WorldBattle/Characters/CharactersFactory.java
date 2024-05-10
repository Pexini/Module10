package Hard.WorldBattle.Characters;

import Hard.WorldBattle.Characters.Hero.Detective;
import Hard.WorldBattle.Characters.Hero.Librarian;
import Hard.WorldBattle.Characters.Hero.Prince_of_Moon;
import Hard.WorldBattle.Characters.Hero.White_Witch;

import static Hard.WorldBattle.Characters.TypeOfHero.*;

public class CharactersFactory {
    public static Character getCharacter (TypeOfHero typeOfHero, TypeOfVillain typeOfVillain){
        if (Prince_of_Moon.equals(typeOfHero)) {
            return new Prince_of_Moon();
        }
        if (White_Witch.equals(typeOfHero)){
            return new White_Witch();
        }
        if (Librarian.equals(typeOfHero)){
            return new Librarian();
        }
        if (Detective.equals(typeOfHero)){
            return new Detective();
        }
    }
}
