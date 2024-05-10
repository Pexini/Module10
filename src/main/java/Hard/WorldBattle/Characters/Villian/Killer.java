package Hard.WorldBattle.Characters.Villian;

import Hard.WorldBattle.Characters.AbstrCharacter;
import Hard.WorldBattle.Characters.Character;
import Hard.WorldBattle.Weapons.TypeOfWeapons;
import Hard.WorldBattle.Weapons.Weapon;
import Hard.WorldBattle.Weapons.WeaponsFactory;

public class Killer extends AbstrCharacter {
    public Killer() {
        super("Sem", 70, WeaponsFactory.getWeapon(TypeOfWeapons.Gun));
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
