package Hard.WorldBattle.Weapons;

public class Revolver implements Weapon{
    @Override
    public String getName() {
        return "Revolver";
    }

    @Override
    public int getDamage() {
        return 35;
    }
}
