package Hard.WorldBattle.Characters;

import Hard.WorldBattle.Weapons.Weapon;

public class AbstrCharacter implements Character {
    private String name;
    private int health;
    private Weapon weapon;



    public AbstrCharacter(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;


    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void attack(Character target) {
        if (Math.random() >= 0.5) {
            int damage = weapon.getDamage();
            target.takedamage(damage);
            System.out.println("Попал " + getName()  +  " нанес урона " + weapon.getDamage());
        } else {
            System.out.println(getName() + " Промах");
        }
    }

    @Override
    public void takedamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}


