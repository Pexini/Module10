package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Vampire extends AbstrCharacter {
    public Vampire(String name, int health) {
        super(name, health, WeaponsFactory.getWeapon(TypeOfWeapons.Teeth));
    }

}
