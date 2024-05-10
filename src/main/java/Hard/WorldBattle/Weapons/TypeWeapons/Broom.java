package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Broom implements Weapon {
    @Override
    public String getName() {
        return "Broom";
    }

    @Override
    public int getDamage() {
        return 20;
    }
}
