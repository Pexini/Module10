package Hard.WorldBattle.Weapons;


import Hard.WorldBattle.Weapons.TypeWeapons.*;

import static Hard.WorldBattle.Weapons.TypeOfWeapons.*;


public class WeaponsFactory {
    public static Weapon getWeapon(TypeOfWeapons typeOfWeapons) {
        if (Sword.equals(typeOfWeapons)) {
            return new Sword();
        }
        if  (Gun.equals(typeOfWeapons)) {
            return new Gun();
        }
        if (Book.equals(typeOfWeapons)) {
            return new Book();
        }
        if (Broom.equals(typeOfWeapons)) {
            return new Broom();
        }
        if (Revolver.equals(typeOfWeapons)) {
            return new Revolver();
        }
        if (Moon_light.equals(typeOfWeapons)) {
            return new Moon_light();
        }
        if (Dark_knife.equals(typeOfWeapons)) {
            return new Dark_knife();
        }
        if (Teeth.equals(typeOfWeapons)) {
            return new Teeth();
        }
throw new IllegalArgumentException("Wrong weapon Type");
    }
}

