package Hard.WorldBattle.Characters;

import Hard.WorldBattle.Weapons.Weapon;

public interface Character {

    String getName();

    int getHealth();

    Weapon getWeapon();

    void attack(Character target);

    void takedamage(int damage);

    boolean isAlive();
}
