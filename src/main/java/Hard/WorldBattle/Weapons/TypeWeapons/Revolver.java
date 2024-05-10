package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Revolver implements Weapon {
    @Override
    public String getName() {
        return "Revolver";
    }

    @Override
    public int getDamage() {
        return 35;
    }
}
