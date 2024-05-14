package Hard.WorldBattle.Characters.Villain;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Dark_Soul extends AbstrCharacter {
    public Dark_Soul(String name, int health) {
        super( name, 50, WeaponsFactory.getWeapon(TypeOfWeapons.Dark_knife));
    }

    }

