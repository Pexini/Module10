package Hard.WorldBattle.Weapons;

import Hard.WorldBattle.Characters.Hero.Detective;
import Hard.WorldBattle.Characters.Hero.Librarian;

import javax.xml.stream.events.Characters;

import static Hard.WorldBattle.Weapons.TypeOfWeapons.Sword;

public class WeaponsFactory {
    public static Weapon getWeapon(TypeOfWeapons typeOfWeapons) {
        if (Sword.equals(typeOfWeapons)) {
            return new Sword();
            }
            if (Gun.equals(typeOfWeapons)) {
                return new Gun();
            }
            if (Book.equals(typeOfWeapons)) {
                return new Book();
            }
            if (Gun.equals(typeOfWeapons)) {
                return new Gun();
            }
            if (Gun.equals(typeOfWeapons)) {
                return new Gun();
            }
            if (Gun.equals(typeOfWeapons)) {
                return new Gun();
            }
            if (Gun.equals(typeOfWeapons)) {
                return new Gun();
            }
            if (Gun.equals(typeOfWeapons)) {
                return new Gun();
            }

        }
    }
}
