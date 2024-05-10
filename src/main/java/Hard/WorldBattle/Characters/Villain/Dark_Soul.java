package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Characters.TypeOfHero;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Dark_Soul extends AbstrCharacter {
    public Dark_Soul() {
        super("Vier", 90, WeaponsFactory.getWeapon(TypeOfWeapons.Dark_knife), TypeOfHero.Dark_Soul);
    }

    }

