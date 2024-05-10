package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.CharactersFactory;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Detective extends AbstrCharacter {
    public Detective() {

        super("Greg", 80, WeaponsFactory.getWeapon(TypeOfWeapons.Revolver), TypeOfHero.Detective);
    }
}
