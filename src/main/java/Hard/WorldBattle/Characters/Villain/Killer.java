package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Killer extends AbstrCharacter {
    public Killer() {
        super("Sem", 70, WeaponsFactory.getWeapon(TypeOfWeapons.Gun));
    }

}
