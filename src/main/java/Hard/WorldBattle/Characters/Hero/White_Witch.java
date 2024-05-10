package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class White_Witch extends AbstrCharacter {
    public White_Witch() {
        super("Helli", 70, WeaponsFactory.getWeapon(TypeOfWeapons.Broom), TypeOfHero.White_Witch);
    }

}
