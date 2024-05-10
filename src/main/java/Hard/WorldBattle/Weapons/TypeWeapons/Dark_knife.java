package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Dark_knife implements Weapon {
    @Override
    public String getName() {
        return "Dark_knife";
    }

    @Override
    public int getDamage() {
        return 20;
    }
}
