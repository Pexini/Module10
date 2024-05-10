package Hard.WorldBattle.Characters;

import Hard.WorldBattle.Weapons.Weapon;

public interface Character {

    String getName();

    int getHealth();

    Weapon getWeapon();

    void attack(Character target);

    void damage(int damage);

    boolean isAlive();
}
