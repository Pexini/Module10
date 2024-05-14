package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Librarian extends AbstrCharacter {
    public Librarian(String name, int health) {
        super(name, health, WeaponsFactory.getWeapon(TypeOfWeapons.Book));
    }

}
