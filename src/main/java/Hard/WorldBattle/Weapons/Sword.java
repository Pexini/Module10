package Hard.WorldBattle.Weapons;

public class Sword implements Weapon{
    @Override
    public String getName() {
        return "Sword";
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
