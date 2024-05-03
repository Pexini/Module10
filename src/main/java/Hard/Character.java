package Hard;

public interface Character {
    String getName();
    int getHealth();
    Weapon getWeapon();
    void attack(Character target);
    void damage (int damage);
}
