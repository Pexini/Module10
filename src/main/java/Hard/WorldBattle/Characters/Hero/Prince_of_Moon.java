package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Prince_of_Moon extends AbstrCharacter {
    public Prince_of_Moon() {
        super("Patrick", 90, WeaponsFactory.getWeapon(TypeOfWeapons.Moon_light), TypeOfHero.Prince_of_Moon);
    }

}
