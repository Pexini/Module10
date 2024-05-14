package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Hunter extends AbstrCharacter {
    public Hunter(String name, int health) {
        super(name, health, WeaponsFactory.getWeapon(TypeOfWeapons.Sword));
    }

}
