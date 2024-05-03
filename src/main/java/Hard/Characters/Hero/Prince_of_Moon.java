package Hard.Characters.Hero;

import Hard.AbstrCharacter;
import Hard.Characters.Character;
import Hard.Weapon;

public class Prince_of_Moon extends AbstrCharacter {
    public Prince_of_Moon(String name, int health, Weapon weapon) {
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
