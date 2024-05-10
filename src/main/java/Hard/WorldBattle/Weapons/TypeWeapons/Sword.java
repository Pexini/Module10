package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Sword implements Weapon {
    @Override
    public String getName() {
        return "Sword";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
