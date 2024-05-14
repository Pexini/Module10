package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class White_Witch extends AbstrCharacter {
    public White_Witch(String name, int health) {
        super(name, health, WeaponsFactory.getWeapon(TypeOfWeapons.Broom));
    }

}
