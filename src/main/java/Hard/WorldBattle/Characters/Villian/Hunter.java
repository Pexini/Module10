package Hard.WorldBattle.Characters.Villian;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Weapons.Weapon;

public class Hunter extends AbstrCharacter {
    public Hunter() {
        super("Hunter", 120, weapon);
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
