package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Killer extends AbstrCharacter {
    public Killer(String name, int health) {
        super(name, health, WeaponsFactory.getWeapon(TypeOfWeapons.Gun));
    }

}
