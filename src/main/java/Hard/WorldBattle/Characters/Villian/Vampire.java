package Hard.WorldBattle.Characters.Villian;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Weapons.Weapon;

public class Vampire extends AbstrCharacter {
    public Vampire(String name, int health, Weapon weapon) {
        super(name, health, weapon);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Weapon getWeapon() {
        return super.getWeapon();
    }

    @Override
    public void attack(Character target) {
        super.attack(target);
    }

    @Override
    public void damage(int damage) {
        super.damage(damage);
    }
}
