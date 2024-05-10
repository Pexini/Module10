package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Teeth implements Weapon {
    @Override
    public String getName() {
        return "Teeth";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
