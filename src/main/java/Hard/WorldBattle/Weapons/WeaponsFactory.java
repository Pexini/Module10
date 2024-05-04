package Hard.WorldBattle.Weapons;

import Hard.WorldBattle.Characters.Hero.Detective;

import javax.xml.stream.events.Characters;

public class WeaponsFactory {
    public static Weapon getWeapon(TypeOfWeapons typeOfWeapons) {
        if (Detective.equals(typeOfHero)) {
            return new revolver;
        }
    }
}
