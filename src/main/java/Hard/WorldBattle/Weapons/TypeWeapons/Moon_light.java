package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Moon_light implements Weapon {
    @Override
    public String getName() {
        return "Moon_light";
    }

    @Override
    public int getDamage() {
        return 25;
    }
}
