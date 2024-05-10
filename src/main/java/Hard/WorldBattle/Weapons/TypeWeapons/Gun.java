package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Gun implements Weapon {
    @Override
    public String getName() {
        return "Gun";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
