package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Detective extends AbstrCharacter {
    public Detective(String name, int health) {

        super(name,health, WeaponsFactory.getWeapon(TypeOfWeapons.Revolver));
    }
}
