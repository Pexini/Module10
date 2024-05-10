package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Librarian extends AbstrCharacter {
    public Librarian() {
        super("Mike", 100, WeaponsFactory.getWeapon(TypeOfWeapons.Book), TypeOfHero.Librarian);
    }

}
