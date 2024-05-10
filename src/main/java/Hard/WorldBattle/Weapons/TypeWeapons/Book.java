package Hard.WorldBattle.Weapons.TypeWeapons;

import Hard.WorldBattle.Weapons.Weapon;

public class Book implements Weapon {
    @Override
    public String getName() {
        return "Book";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
