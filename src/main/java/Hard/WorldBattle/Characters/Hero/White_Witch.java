package Hard.WorldBattle.Characters.Hero;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Weapons.Weapon;

public class White_Witch extends AbstrCharacter {
    public White_Witch(String name, int health, Weapon weapon) {
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
