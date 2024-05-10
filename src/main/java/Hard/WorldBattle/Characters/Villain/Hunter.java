package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Hunter extends AbstrCharacter {
    public Hunter() {
        super("Hunter", 120, WeaponsFactory.getWeapon(TypeOfWeapons.Sword), TypeOfHero.Hunter);
    }

}
