package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Vampire extends AbstrCharacter {
    public Vampire() {
        super("Vlad", 99, WeaponsFactory.getWeapon(TypeOfWeapons.Teeth), TypeOfHero.Vampire);
    }

}
