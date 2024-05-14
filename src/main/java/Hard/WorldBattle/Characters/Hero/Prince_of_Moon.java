package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Prince_of_Moon extends AbstrCharacter {
    public Prince_of_Moon(String name, int health) {
        super(name, health, WeaponsFactory.getWeapon(TypeOfWeapons.Moon_light));
    }

}
